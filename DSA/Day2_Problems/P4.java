import java.util.*;

public class P4 {
    public static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println("Factorial of " + n + " is " + fact(n));
    }
}
