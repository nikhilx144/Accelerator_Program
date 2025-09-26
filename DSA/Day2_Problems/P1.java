import java.util.*;

public class P1 {
    public static int binarySearch(int arr[], int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (target > arr[mid]) l = mid + 1;
            else if (target < arr[mid]) r = mid - 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        System.out.println("Target: " + target + " is at index " + (result));
        sc.close();
    }
}
