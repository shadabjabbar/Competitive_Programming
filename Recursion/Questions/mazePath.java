/**
 * 1. You are given a number n and a number m representing number of rows and columns in a maze.
 * 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
 * 3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
 * Use sample input and output to take idea about output.
 *
 * Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 */


package Recursion.Questions;
import java.io.*;
import java.util.*;
public class mazePath {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Row");
        int n=Integer.parseInt(in.readLine());
        System.out.println("Enter the Number of Column");
        int m =Integer.parseInt(in.readLine());
        ArrayList<String> answer = getMazePaths(1,1,n,m);
        System.out.println(answer);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&&sc==dc)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hapths =new ArrayList<String>();
        ArrayList<String> vpaths = new ArrayList<String>();
        if(sc<dc)
        hapths=getMazePaths(sr,sc+1,dr,dc);
        if(sr<dr)
            vpaths=getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> paths = new ArrayList<String>();
        for(String item : hapths)
            paths.add("h"+item);
        for(String item : vpaths)
            paths.add("v"+item);
        return paths;
    }
}
