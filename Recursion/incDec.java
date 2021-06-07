 /**
 * This Program will print the Numbers from n to 1  then print from 1 to n
 */
package Recursion;

import java.util.Scanner;

public class incDec {
    static void increasingNumber(int n)
    {
        if(n==0)
            return;
        System.out.print(n+" ");
        increasingNumber(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n =in.nextInt();
        increasingNumber(n);
    }
}
