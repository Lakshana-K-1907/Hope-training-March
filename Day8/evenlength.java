import java.util.*;

public class evenlength {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (s.charAt(i) == ' ') {
                if (count % 2 == 0) {
                    System.out.println(sb);
                    sb.setLength(0);
                    count=0;
                }

            } else {
                count++;
            }

        }
    }
}