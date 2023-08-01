import java.util.HashSet;
import java.util.Set;

public class PasswordSecurity {

    /*
    * In order to provide the user with information about the password's strength, we aim to notify them about
    * the longest substring within the password that does not contain any repeated characters. To achieve this,
    * we require a function that takes a password string as input and returns the length of the longest substring
    * without any repeated characters.
    *
    * Example 1:
    *   String password = "abcabcbb";
    *   expectedOutput = 3;
    *
    * Example 2:
    *   String password = "bbbbb";
    *   int expectedOutput = 1;
    *
    * */
    public static void main(String[] args){
        String password = "a";
        System.out.println(longestSubstringWithoutRepeatingChars(password));

        password = "aabcdefg";
        System.out.println(longestSubstringWithoutRepeatingChars(password));

        password = "abcdefggh";
        System.out.println(longestSubstringWithoutRepeatingChars(password));

        password = "";
        System.out.println(longestSubstringWithoutRepeatingChars(password));

        password = "abcbde";
        System.out.println(longestSubstringWithoutRepeatingChars(password));

        password = "abcdefg";
        System.out.println(longestSubstringWithoutRepeatingChars(password));

        password = null;
        System.out.println(longestSubstringWithoutRepeatingChars(password));
    }

    public static int longestSubstringWithoutRepeatingChars(String password){

        if(password == null || password.equals("")){
            return 0;
        }

        Set<Character> longestSubStr = new HashSet<>();

        int i = 0;
        int j = 0;
        int maxLength = 0;
        while(j < password.length()){

            if(!longestSubStr.contains(password.charAt(j))){
                longestSubStr.add(password.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            }else{
                longestSubStr.remove(password.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
