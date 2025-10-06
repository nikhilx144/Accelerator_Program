import java.util.*;

public class P2 {
    public static boolean checkParentheses(String parentheses) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : parentheses.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if ((top == '(' && c == ')') || (top == '[' && c == ']') || (top == '{' && c == '}')) stack.pop();
                else return false;
            }
        }
        return (stack.isEmpty() ? true : false);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String output = checkParentheses(str) ? "Balanced" : "Not Balanced";
        System.out.println(output);
    }
}