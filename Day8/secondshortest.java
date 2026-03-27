import java.util.*;

public class secondshortest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] arr = new int[1000];
        int j = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (s.charAt(i) == ' ') {
                sb.deleteCharAt(sb.length() - 1);
                arr[j++] = sb.length();
                sb.setLength(0);
            }
        }

        if (sb.length() > 0) {
            arr[j++] = sb.length();
        }

        Arrays.sort(arr, 0, j);
        int second = arr[1];

        sb.setLength(0);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                if (sb.length() == second) {
                    System.out.println("Second shortest string: " + sb);
                    return;
                }
                sb.setLength(0);
            }
        }

        if (sb.length() == second) {
            System.out.println("Second shortest string: " + sb);
        }
    }
}