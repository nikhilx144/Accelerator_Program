import java.util.*;

public class P4 {
    public static void printDuplicate(int arr[]) {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (hs.contains(num)) duplicates.add(num);
            else hs.add(num);
        }
        if (duplicates.isEmpty()) System.out.println("No Duplicates Found");
        else System.out.println("Duplicates :- " + duplicates);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printDuplicate(arr);
    }
}