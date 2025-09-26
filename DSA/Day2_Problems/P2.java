import java.util.*;

public class P2 {
    public static void reverseArray(int arr[], int l, int r) {
        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        }
    }
    
    public static void rotateArrayByK(int arr[], int k) {
        k = k % arr.length;
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
    }

    public static void printArray(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) System.out.print(arr[i]);
            else System.out.print(arr[i] + ", ");
        }
        System.out.print(" ]\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k value: ");
        int k = sc.nextInt();
        printArray(arr);
        rotateArrayByK(arr, k);
        printArray(arr);
    }
}
