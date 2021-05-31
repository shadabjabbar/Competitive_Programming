package ArraysManipulation;
import java.util.*;
public class quickSort {
    int partition(int[] arr,int low,int high)
    {
        int pivot=arr[(low+high)/2];//pivoting the middle element
        while(low<=high)
        {
            while(arr[low]<pivot)
            {
                low++;
            }
            while(arr[high]>pivot)
            {
                high--;
            }
            if(low<=high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
    void quick(int arr[],int low,int high)
    {
        int pi=partition(arr,low,high);
        if(low<pi-1)
        {
            quick(arr,low,pi-1);
        }
        if(pi<high)
        {
            quick(arr,pi,high);
        }

    }
    void printArray(int arr[])
    {
        for(int item:arr)
            System.out.print(item+" ");
    }
    public static void main(String[] args) {
        quickSort ob=new quickSort();
        int[] arr={10,22,1,5,89,78,112};
        int l=arr.length;
        ob.quick(arr,0,l-1);
        ob.printArray(arr);
    }

}
