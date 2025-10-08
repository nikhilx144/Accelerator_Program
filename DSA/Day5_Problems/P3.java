import java.util.*;

public class P3 {
    public static void printArray(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) System.out.print(arr[i] + ", ");
            else System.out.print(arr[i] + " ]");
        }
    }
    
    public static void insertionSort(int arr[]) {
        int n = arr.length, j, eleToInsert;
        for (int i = 0; i < n; i++) {
            j = i - 1;
            eleToInsert = arr[i];
            while (j > -1 && eleToInsert < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            } 
            arr[j + 1] = eleToInsert; 
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
        insertionSort(arr);
        printArray(arr);
    }
}
