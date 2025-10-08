import java.util.*;

public class P4 {
    public static void printArray(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) System.out.print(arr[i] + ", ");
            else System.out.print(arr[i] + " ]");
        }
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int i = low, j = mid + 1, k = low;
        int mergedArray[] = new int[high + 1];
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) mergedArray[k++] = arr[i++];
            else mergedArray[k++] = arr[j++];
        }
        while (i <= mid) mergedArray[k++] = arr[i++]; 
        while (j <= high) mergedArray[k++] = arr[j++]; 
        for (i = low; i <= high; i++) arr[i] = mergedArray[i];
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
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
        mergeSort(arr, 0, n - 1);
        printArray(arr);
    }
}
