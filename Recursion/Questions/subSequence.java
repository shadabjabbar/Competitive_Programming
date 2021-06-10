/**
 * 1. You are given a string str.
 * 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
 * Use sample input and output to take idea about subsequences.
 *
 * Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
 * Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 *
 * Sample Input:-"abc"
 * Sample Output-[, c, b, bc, a, ac, ab, abc]
 */

package Recursion.Questions;

import java.io.*;
import java.util.*;

public class subSequence {
    public static ArrayList<String> seq(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> bstr=new ArrayList<String>();
            bstr.add(" ");
            return bstr;
        }
        char ch=str.charAt(0);
        ArrayList<String> sstr=seq(str.substring(1));
        ArrayList<String> mstr=new ArrayList<String>();

        for(String str1:sstr)
        {
            mstr.add(" "+str1);
        }

        for(String str1:sstr)
        {
            mstr.add(ch+str1);
        }
        return mstr;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String str=in.readLine();
        ArrayList<String> ans=seq(str);
        System.out.println(ans);
    }
}
