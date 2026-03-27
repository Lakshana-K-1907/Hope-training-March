import java.util.*;

public class nonrepeat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[256]; // ASCII size

        // Step 1: Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        // Step 2: Find first non-repeating character
        for (char ch : s.toCharArray()) {
            if (freq[ch] == 1) {
                System.out.println(ch);
                sc.close();
                return;
            }
        }

        // If no non-repeating character found
        System.out.println("No non-repeating character");
        sc.close();
    }
}
