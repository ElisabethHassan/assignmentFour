import java.util.Stack;

public class Infix_Postfix_Q7 {

    public String infixToPostfix(String s){
        String postfix = "";
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isAlphabetic(c)) postfix += c;
            else if (c == '('){
                stack.push(c);
            } else if (c == ')'){
                while(!stack.isEmpty() && stack.peek() != '(') postfix += stack.pop();
                stack.pop(); //take out the '(' from stack
            } else {
                //if the operator has less precedence than what is in the stack
               while(!stack.isEmpty() && precedence(stack.peek()) >=  precedence(c)){
                   postfix += stack.pop(); // add the values in the stack to postfix
               }
               stack.push(c); //push current operator to stack
            }

        }

        //take off remaining operators from stack and add to postfix
        while (!stack.isEmpty()) {
            postfix += (stack.pop());
        }

        return postfix;
    }


    //establishes precendece
    private int precedence(char o){
        switch(o){
            case '^':
                return 3;
            case '/':
            case '*':
                return 2;
            case '-':
            case '+':
                return 1;
            default:
                return -1;
        }
    }





}
