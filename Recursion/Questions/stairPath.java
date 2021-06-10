/**
 * 1. You are given a number n representing number of stairs in a staircase.
 * 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
 * 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
 * Use sample input and output to take idea about output.
 *
 * Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 *
 * Sample Input
 * 3
 * Sample output
 * [111, 12, 21, 3]
 */

package Recursion.Questions;
import java.io.*;
import java.util.*;
public class stairPath {
    public static ArrayList<String> getStairPaths(int n) {
        if(n==0)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        if(n<0)
        {
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }
        ArrayList<String> path1=getStairPaths(n-1);
        ArrayList<String> path2=getStairPaths(n-2);
        ArrayList<String> path3=getStairPaths(n-3);
        ArrayList<String> paths=new ArrayList<>();
        for(String path:path1)
            paths.add("1"+path);
        for(String path:path2)
            paths.add("2"+path);
        for(String path:path3)
            paths.add("3"+path);
        return paths;
    }

    public static void main(String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of stairs");
        int n = Integer.parseInt(reader.readLine());
        ArrayList<String> answer=getStairPaths(n);
        System.out.println(answer);
        System.out.println("No of ways coming to ground "+answer.size());
    }
}
