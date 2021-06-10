package Recursion.Questions;
import java.util.*;
import java.io.*;
public class wordsCombination {
    static String codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0)
        {
            ArrayList<String> bres=new ArrayList<String>();
            bres.add(" ");
            return bres;
        }
        char ch=str.charAt(0);
        String paString=str.substring(1);
        ArrayList<String> rres=getKPC(paString);
        ArrayList<String> mres=new ArrayList<String>();
        String code=codes[ch-'0'];
        for(int i=0;i<code.length();i++)
        {
            char ch1=code.charAt(i);
            for(String item:rres)
                mres.add(ch1+item);
        }
        return mres;
    }
    public static void main(String[] args)throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number");
        String number = in.readLine();
        ArrayList<String> ans=getKPC(number);
        System.out.println(ans);
    }
}
