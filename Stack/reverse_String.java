package Stack;
import java.util.*;
public class reverse_String {
    public static void main(String[] args) {
        String str = "kunal";
        Stack<Character> stack = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            stack.push(str.charAt(i));
        }
        // System.out.print(stack);
        StringBuilder sb = new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        System.out.print(sb.toString());
    }
}
