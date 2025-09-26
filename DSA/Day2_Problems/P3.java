import java.util.*;

public class P3 {
    public static void printFreqDist(String str) {
        HashMap<Character, Integer> freqDist = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqDist.put(c, freqDist.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> e : freqDist.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        printFreqDist(str);
    }
}
