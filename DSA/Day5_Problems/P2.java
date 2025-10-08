import java.util.*;

public class P2 {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) System.out.print(arr[i] + ", ");
            else System.out.print(arr[i] + " ]");
        }
    }
    
    public static void selectionSort(int arr[]) {
        int n = arr.length, minIndex;
        for (int i = 0; i < n; i++) {
            minIndex = i;
            for (int j = minIndex; j < n; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            swap(arr, minIndex, i);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        printArray(arr);
    }    
}
