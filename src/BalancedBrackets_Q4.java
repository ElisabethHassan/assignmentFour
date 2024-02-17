import java.util.Stack;

public class BalancedBrackets_Q4 {

    public String isBalanced(String s){
        //thinking
        /*
            if the character is an opening
            push the bracket to the stack
            if the next character is the closing of the bracket then
            pop what is in the stack
            if the next is the closing of another stack then return no
         */

        char[] sChar = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < sChar.length; i++){
            if(sChar[i] == '[' || sChar[i] == '{' || sChar[i] == '('){
                stack.push(sChar[i]);
            } else if (sChar[i] == ']' || sChar[i] == '}' || sChar[i] == ')'){
                if(stack.isEmpty()) return "NO";
                if(stack.peek() == '{' && sChar[i] == '}') stack.pop();
                else if(stack.peek() == '(' && sChar[i] == ')') stack.pop();
                else if(stack.peek() == '[' && sChar[i] == ']') stack.pop();
                else return "NO";
            }

        }

        return "YES";
    }




}
