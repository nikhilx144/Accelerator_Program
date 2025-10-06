import java.util.*;

public class P3 {
    public static int findMissingNumber(int arr[]) {
        int sum = 0;
        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        for (int num : arr) {
            sum += num;
        }
        return expectedSum - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("The missing number is = " + findMissingNumber(arr));
    }
}