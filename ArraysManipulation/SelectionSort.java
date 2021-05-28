package ArraysManipulation;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        // One by one move boundary of unsorted subarray
        for(int i=0;i<n-1;i++)
        {
            int minIndex=i;
            //Finding the minimum Position and storing it for later use
            for(int j=i+1;j<n;j++)
                if(arr[minIndex]>arr[j])
                    minIndex=j;
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
        }
        for(int item:arr)
            System.out.print(item+" ");
    }
}
