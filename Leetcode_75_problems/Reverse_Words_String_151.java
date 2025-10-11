package Leetcode_75_problems;

class Reverse_Words_String_151 {
public static void main(String[] args) {
    String str = "java is popular";
    str = str.trim(); // extra spaces remove
    String words[] = str.split("\\s+");  //split the words by one occurence.
    StringBuilder sb = new StringBuilder();
    for(int i=words.length-1;i>=0;i--){
        sb.append(words[i]);
        if(i!=0){
            sb.append(" ");
        }
    }
    System.out.print(sb.toString()); // popular is java


}
    
}