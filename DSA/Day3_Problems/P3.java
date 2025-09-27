import java.util.*;

public class P3 {
    public static int[] mergeSortedArrays(int arr1[], int arr2[]) {
        int i = 0, j = 0, k = 0;
        int res[] = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
                k++;
            }
            else if (arr1[i] > arr2[j]) {
                res[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length) {
            res[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            res[k++] = arr2[j++];
        }
        
        return res;
    }

    public static void printArray(int arr[]) {
        System.err.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) System.out.print(arr[i] + ", ");
            else System.out.print(arr[i]);
        }
        System.err.print(" ]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first sorted array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second sorted array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }
        printArray(mergeSortedArrays(arr1, arr2));
    }
}
