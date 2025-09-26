import java.util.Scanner;

public class P3 {
    public static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if (isPalindrome(str)) System.out.println(str + " is a palindrome");
        else System.out.println(str + " is not a palindrome");
    }
}
