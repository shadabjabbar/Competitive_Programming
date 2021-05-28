package ArraysManipulation;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        //Imaging that 0 position is already sorted..
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key)
            {
                //Swapping the values at key position by greater values behind it iterating backwards...
                arr[j+1]=arr[j];
                j--;
            }
            //Swapping the key at the right place where it deserve
            arr[j+1]=key;
        }
        for(int item:arr)
            System.out.print(item+" ");
    }
}
