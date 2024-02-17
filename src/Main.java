import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        BalancedBrackets_Q4 b = new BalancedBrackets_Q4();
        String s = "{[()]}";
        String v = "{[(])}";
        String d = "{{[[(())]]}}";

        System.out.println(b.isBalanced(s));
        System.out.println(b.isBalanced(v));
        System.out.println(b.isBalanced(d));


//        Stack<Integer> s = new Stack<>();
//        Queue<Integer> s = new LinkedList<>();
//        s.add(1);
//        System.out.println(s);
//        s.add(s.remove() + 6);
//        System.out.println(s);
//        s.add(18);
//        System.out.println(s);
//        s.add(s.remove() / 2);
//        System.out.println(s);
//        s.remove();
//        System.out.println(s);
//        s.remove();
//        System.out.println(s);

    }
}