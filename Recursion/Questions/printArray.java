/**
 * Array arr={10,20,30,40,60} print the array
 */

package Recursion.Questions;

public class printArray {
    static void print(int arr[],int length)
    {
        if(length==-1)
            return;
        print(arr,length-1);
        System.out.print(arr[length]+" ");
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        print(arr,arr.length-1);//As first Element Starts from 0
    }
}
