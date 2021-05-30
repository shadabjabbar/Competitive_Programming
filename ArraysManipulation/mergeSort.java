package ArraysManipulation;
import java.util.*;
public class mergeSort {
    int[] array;
    void getArray(int[] a)
    {
        array=new int[a.length];
        for(int i=0;i<a.length;i++)
            array[i]=a[i];
    }
    void merge(int l,int mid,int r)
    {
        int i=l,j=mid+1,k=l;
         int b[]=new int[r+1];
         while(i<=mid&&j<=r)
         {
             if(array[i]>array[j])
                 b[k++]=array[j++];
             else
                 b[k++]=array[i++];
         }
         while(i<=mid)
           b[k++]=array[i++];
        while(j<=r)
           b[k++]=array[j++];
        for(i=l;i<=r;i++)
            array[i]=b[i];
    }
    void MergeSort(int l,int r)
    {
        if(l<r)
        {
            int mid=l+(r-l)/2;
            MergeSort(l,mid);
            MergeSort(mid+1,r);
            merge(l,mid,r);
        }
    }
    void printArray()
    {
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        mergeSort ob=new mergeSort();
        System.out.println("Enter the size of Array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        ob.getArray(arr);
        ob.MergeSort(0,n-1);
        ob.printArray();
    }
}
