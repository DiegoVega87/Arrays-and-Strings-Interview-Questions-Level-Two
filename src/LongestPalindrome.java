
import java.util.Stack;

public class LongestPalindrome {

    /*
    * We have a marketing campaign where we need to identify the longest palindromic substring from a given string.
    * The palindromic substring can help us identify the words that can be used as catchy slogans or product names.
    * Can you create a function that takes a string as input and returns the longest palindromic substring in it?
    *
    * Example 1:
    *   String s = "racecar";
    *   String expectedOutput = "racecar";
    *
    * Example 2:
    *   String s = "babad";
    *   String expectedOutput = "bab";
    * */

    public static void main(String[] args){
        String s = "racecar";
        System.out.println(longestPalindromicSubstring(s));

        s = "babad";
        System.out.println(longestPalindromicSubstring(s));

        s = "babad";
        System.out.println(longestPalindromicSubstring(s));

        s = "";
        System.out.println(longestPalindromicSubstring(s));

        s = null;
        System.out.println(longestPalindromicSubstring(s));

        s = "babadd";
        System.out.println(longestPalindromicSubstring(s));

    }
    public static String longestPalindromicSubstring(String s){

        if( s == null || s.isEmpty()){
            return "";
        }

        Stack<String> substrings = new Stack<>();

        for(int i = 1; i <= s.length(); i++){
            String subString = s.substring(0,i);
            if(isPalindromic(subString)){
                substrings.push(subString);
            }
        }

        return substrings.pop();

    }

    private static boolean isPalindromic(String subString){

        int length = subString.length();
        for(int i = 0; i < length/2; i++){
            if(subString.charAt(i) != subString.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
