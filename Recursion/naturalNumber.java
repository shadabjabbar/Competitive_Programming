//This Program print the Natural Number from n up to 1
//5 4 3 2 1
package Recursion;

import java.util.*;
public class naturalNumber {
    static void decreasingNumber(int n)
    {
        if(n==0)
            return;
        System.out.print(n+" ");
        decreasingNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n =in.nextInt();
        decreasingNumber(n);
    }
}
