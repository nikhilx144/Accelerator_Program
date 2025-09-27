import java.util.*;

public class P2 {
    public static int getSecondLargest(int arr[]) {
        int max1, max2;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        }
        else {
            max2 = arr[0];
            max1 = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } 
            else if (arr[i] > max2) { 
                max2 = arr[i];
            }
        }
        
        return max2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Second largest element in the array is " + getSecondLargest(arr) + ".");
    }    
}
