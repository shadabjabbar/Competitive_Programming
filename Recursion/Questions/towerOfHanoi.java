/**
 * 1. There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 and 3 are empty.
 * 2. The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom.
 * 3. You are required to
 *     3.1. Print the instructions to move the disks.
 *     3.2. from tower 1 to tower 2 using tower 3
 *     3.3. following the rules
 *         3.3.1 move 1 disk at a time.
 *         3.3.2 never place a smaller disk under a larger disk.
 *         3.3.3 you can only move a disk at the top.
 *
 * Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 */

package Recursion.Questions;

import java.util.Scanner;
public class towerOfHanoi {
    static void toh(int n,String t1,String t2,String t3)
    {
        if(n==0) //Base condition
            return;
        toh(n-1,t1,t3,t2);//Place the disc from tower 1 to tower 3 using Tower 2
        System.out.println("Move Disc "+n+" from Tower "+t1+" to Tower "+t2);//Place the remaining disc from tower 1 to tower 2
        toh(n-1,t3,t2,t1);//Place the disc from Tower 3 to tower 2 using Tower 1
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of Disc");
        int n=in.nextInt();
        toh(n,"A","B","C");
        System.out.println("Hurray! Puzzled Solved");
    }
}
