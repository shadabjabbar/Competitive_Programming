package ArraysManipulation;

import java.util.*;
public class NestedList {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,i,j,q;
        n=in.nextInt();
        List<Integer> child[]= new ArrayList[n];
        for(i=0;i<n;i++)
        {
            int d=in.nextInt();
            child[i]=new ArrayList<Integer>();
            for(j=0;j<d;j++)
            {
                int ele=in.nextInt();
                child[i].add(ele);
            }
        }
        q=in.nextInt();
        for(i=1;i<=q;i++)
        {
            int ele1=in.nextInt();
            int ele2=in.nextInt();
            try{
                System.out.println(child[ele1-1].get(ele2-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}
