import java.util.Scanner;

public class P4 {
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();            
        }
        System.out.println("Element found at index " + linearSearch(arr, target));
    }
}
