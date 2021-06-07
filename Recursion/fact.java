//Finding the Factorial of number
//5!= %*4*3*2*1;

package Recursion;
import java.io.*;
import java.util.Scanner;

public class fact {
    static int factorial(int n)
    {
        if(n==1)
            return 1;
        //Also we can write // return n*fact(n-1);
        int f=factorial(n-1);
        int fn1=n*f;
        return fn1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(factorial(n));
    }
}
