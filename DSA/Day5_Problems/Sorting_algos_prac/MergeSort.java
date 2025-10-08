import java.util.*;

public class MergeSort {
    public static void merge(int arr[], int low, int mid, int high) {
        int i = low, j = mid + 1, k = low;
        int auxArray[] = new int[high + 1];
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) auxArray[k++] = arr[i++];
            else auxArray[k++] = arr[j++];
        }
        while (i <= mid) auxArray[k++] = arr[i++]; 
        while (j <= high) auxArray[k++] = arr[j++]; 
        for (i = low; i <= high; i++) arr[i] = auxArray[i];
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void printArray(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) System.out.print(arr[i] + ", ");
            else System.out.print(arr[i] + " ]");
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
