package ArraysManipulation;
import java.util.*;
public class lexoOrder {

        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";
            //if(s.length()<=3)
            //return s+"\n"+s;
            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'
            String lex[]=new String[s.length()-k];
            for(int i=0;i<s.length()-k;i++)
            {
                lex[i]=s.substring(i,i+k);
            }
            for(int i=0;i<lex.length-1;i++)
            {
                for(int j=0;j<lex.length-1-i;j++)
                {
                    if(lex[j].compareTo(lex[j+1])>0)
                    {
                        String temp=lex[j];
                        lex[j]=lex[j+1];
                        lex[j+1]=temp;
                    }
                }
            }
            smallest=lex[0];
            largest=lex[lex.length-1];
            return smallest + "\n" + largest;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }

}
