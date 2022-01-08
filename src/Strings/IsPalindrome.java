package Strings;

public class IsPalindrome {
    public static boolean isPalindrome(String s ) {
         s = s.replaceAll("[^a-zA-Z0-9]", "");
         s = s.toLowerCase();

         int i =0;
         int j = s.length()-1;
         while(i< j) {
             if (s.charAt(i) != s.charAt(j))
                 return false;
             i++;
             j--;
         }
         return true;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }
}
