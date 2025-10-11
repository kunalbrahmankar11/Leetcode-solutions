package Leetcode_75_problems;

public class Merge_String_alternate_1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                str.append(word1.charAt(i));
            }
            if(i<word2.length()){
                str.append(word2.charAt(i));
            }
            i++;
        }
        return str.toString();

        
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
        
        
    }
}
