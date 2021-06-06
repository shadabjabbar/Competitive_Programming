package ArraysManipulation;

import java.util.*;
public class insertDelete {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Accepting the test Cases
        int n=in.nextInt();
        List<Integer> al=new ArrayList<Integer>();
        while(n!=0)
        {
            int ele=in.nextInt();
            al.add(ele);
            n--;
        }
        //Accepting the queries
        n=in.nextInt();
        while(n!=0)
        {
            String choice=in.next();
            if(choice.equalsIgnoreCase("Insert"))
            {
                int position=in.nextInt();
                int value=in.nextInt();
                al.add(position,value);
            }
            else if(choice.equalsIgnoreCase("Delete"))
            {
                int position=in.nextInt();
                al.remove(position);
            }
            n--;
        }
        for(int ele:al)
            System.out.print(ele+" ");
    }
}
