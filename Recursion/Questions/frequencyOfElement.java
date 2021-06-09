/**
 * 1. You are given a number n, representing the count of elements.
 * 2. You are given n numbers.
 * 3. You are given a number x.
 * 4. You are required to find the first index at which x occurs in array a.
 * 5. If x exists in array, print the first index where it is found otherwise print -1.
 *
 * Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 */

package Recursion.Questions;

public class frequencyOfElement {
    public static int firstIndex(int[] arr, int idx, int x){
        int pos;
        if(idx==arr.length)
            return -1;
        else if(arr[idx]==x)
            return idx;
        else
            pos=firstIndex(arr,idx+1,x);
        return pos;
    }

    public static void main(String[] args) {
        int []array={78,14,78,45,1112,23,100000};
        System.out.println(firstIndex(array,0,2));
    }
}
