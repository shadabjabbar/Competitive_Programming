//Finding the power
//Concept is 5^3=5^2*5 and making it recusrive

package Recursion;

import java.util.Scanner;

public class pow {
    static int power(int m,int n)
    {
        if(n==0)
            return 1;           //m raise to power 0 is = 1
        int p=power(m,n-1);  //Making it recursive
        int ans=p*m;
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        System.out.println(power(m,n));
    }
}
