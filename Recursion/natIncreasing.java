//This Program print the Natural Number from 1 up to n
//1 2 3 4 5

package Recursion;

import java.util.Scanner;

public class natIncreasing {
    static void increasingNumber(int n)
    {
        if(n==0)
            return;
        increasingNumber(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n =in.nextInt();
        increasingNumber(n);
    }
}
