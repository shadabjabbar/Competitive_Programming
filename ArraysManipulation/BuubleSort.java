package ArraysManipulation;

import java.util.Scanner;

public class BuubleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            //Swapping in Pairs
            for (int j = 0; j < n-1-i; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
        for (int item : arr)
            System.out.print(item + " ");
    }
}
