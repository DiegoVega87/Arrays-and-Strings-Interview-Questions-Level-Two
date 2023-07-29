import java.security.Key;
import java.util.*;

public class AnagramGrouper {

    /*
    * As a startup working on a language learning platform, we have a dataset of words in different languages.
    * We want to group all the anagrams together to help our users learn and remember vocabulary more efficiently.
    * We need you to write a function that takes in an array of strings returns a list of lists, where each list
    * contains strings that are anagrams of each other.
    *
    *
    * Example 1:
    *   String[] words = {""eat"", ""tea"", ""tan"", ""ate"", ""nat"", ""bat""};
    *   List<List<String>> expectedOutput = new ArrayList<>();
    *   expectedOutput.add(Arrays.asList(""eat"", ""tea"", ""ate""));
    *   expectedOutput.add(Arrays.asList(""tan"", ""nat""));
    *   expectedOutput.add(Arrays.asList(""bat""));
    *   List<List<String>> actualOutput = groupAnagrams(words);
    *   assert expectedOutput.equals(actualOutput);
    *
    *
    * Example 2:
    *   String[] words = {""listen"", ""silent"", ""elbow"", ""below"", ""state"", ""taste""};
    *   List<List<String>> expectedOutput = new ArrayList<>();
    *   expectedOutput.add(Arrays.asList(""listen"", ""silent""));
    *   expectedOutput.add(Arrays.asList(""elbow"", ""below""));
    *   expectedOutput.add(Arrays.asList(""state"", ""taste""));
    *   List<List<String>> actualOutput = groupAnagrams(words);
    *   assert expectedOutput.equals(actualOutput);
    *
    * */
    public static void main(String[] args){

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};


        List<List<String>> list = groupAnagrams(words);

//        for(List<String> l : list){
//            System.out.println(l);
//        }

    }
    public static List<List<String>> groupAnagrams(String[] words){

        Map<char[], List<String>> groups = new HashMap<>();

        for(String word : words){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            groups.put(arr, new ArrayList<>());
        }

        for(char[] s : groups.keySet()){
            System.out.println(Arrays.toString(s));;
        }
        return null;
    }
}
