import java.util.*;

public class compressed {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character, Integer> h = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            h.put(ch, h.getOrDefault(ch, 0) + 1);
        }
                    
        for (Character key : h.keySet()) {
            int val = h.get(key);

            while (val > 9) {
                System.out.print("9" + key);
                val -= 9;
            }

            System.out.print(val + "" + key);
        }

        sc.close();
    }
}