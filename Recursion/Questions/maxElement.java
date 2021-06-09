/**
 * 1. You are given a number n, representing the count of elements.
 * 2. You are given n numbers.
 * 3. You are required to find the maximum of input.
 * 4. For the purpose complete the body of maxOfArray function. Don't change the signature.
 *
 * Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 */

package Recursion.Questions;

public class maxElement {
    public static int maxOfArray(int[] array,int idx)
    {
        if(idx==array.length-1)
            return array[idx];
        int max=maxOfArray(array,idx+1);
        max=(max<array[idx])?array[idx]:max;
        return max;
    }
    public static void main(String[] args) {
        int []array={78,14,45,1112,23,100000};
        System.out.println(maxOfArray(array,0));
    }
}
