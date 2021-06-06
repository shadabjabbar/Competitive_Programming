package ArraysManipulation;

public class Longest_Palindrome {
    public String longestPalindrome(String s) {
            if (s.length() == 1)
                return s;
            String maxString = "";
            int maxLength = 1, start = 0, end = 0;
            //Finding for the odd by supposintg i as the mid value
            for (int i = 0; i < s.length() - 1; i++) {
                int l = i, r = i;
                while (l >= 0 && r < s.length()) {
                    if (s.charAt(l) != s.charAt(r))
                        break;
                    else {
                        l--;
                        r++;
                    }
                }
                int length = r - l - 1;
                if (length > maxLength) {
                    maxLength = length;
                    start = ++l;
                    end = r;
                }
            }
            //Finding the length of even
            for (int i = 0; i < s.length() - 1; i++) {
                int l = i, r = i + 1;

                while (l >= 0 && r < s.length()) {
                    if (s.charAt(l) != s.charAt(r))
                        break;
                    else {
                        l--;
                        r++;
                    }
                }
                int length = r - l - 1;
                if (length > maxLength) {
                    maxLength = length;
                    start = ++l;
                    end = r;
                }
            }
            return s.substring(start, end);
        }
        public static void main(String[] args) {
            Longest_Palindrome ob =new Longest_Palindrome();
            System.out.println(ob.longestPalindrome("bab"));
        }
}
