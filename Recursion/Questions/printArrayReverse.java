/**
 * Array arr={10,20,30,40,60} print the array in reverse from
 */

package Recursion.Questions;

public class printArrayReverse {
    static void print(int arr[],int length)
    {
        if(length==-1)
            return;
        System.out.print(arr[length]+" ");
        print(arr,length-1);
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        print(arr,arr.length-1);//As first Element Starts from 0
    }
}
