import java.util.*;

class StackArray {
    int top = -1;
    int stack[];
    StackArray() {
        stack = new int[99];
    }

    void push(int n) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return ;
        }
        stack[++top] = n;
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(stack[top]); 
    }

    int pop() {
        if (top == -1) return -1;
        return stack[top--];
    }
}

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackArray st = new StackArray();
        while (true) {
            String opParts[] = sc.nextLine().split(" ");
            String operation = opParts[0].toLowerCase();
            switch (operation) {
                case "push":
                    st.push(Integer.parseInt(opParts[1]));
                    break;
                case "pop":
                    int poppedEle = st.pop();
                    if (poppedEle != -1) System.out.println(poppedEle);
                    else System.out.println("Stack Underflow");
                    break;
                case "peek":
                    st.peek();
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }
    }
}
