//5^4=5^2*5^2  for even
//5^7=5^3*5^3*5 for odd
//We will calculate pow(5,4)=pow(5,2)*pow(5,2) and so on

package Recursion;

import java.util.Scanner;

public class powLog {
    static int power(int m,int n)
    {
        if(n==0)
            return 1;           //m raise to power 0 is = 1
        int p=power(m,n/2);  //Making it recursive
        int ans=p*p;            //Squaring of the power
        if(n%2==1)              //Checking the condition of even or Odd
        ans=ans*m;              //if odd multiply by the number this will execute when n become 1 so that ans can hold m raise to the 1 and cehck each time
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        System.out.println(power(m,n));
    }
}
