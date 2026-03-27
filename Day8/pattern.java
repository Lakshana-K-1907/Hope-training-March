import java.util.*;

public class pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int c = len - 2 - i;
            int t = i;
            if (c <= 0) {
                t = len - 1 - i;
                c = len - 2 - t;
            }
            for (int j = 0; j < len; j++) {
                if (j == 0) {
                    System.out.print(s.charAt(i));
                } else if (j == c) {
                    System.out.print(s.charAt(len - 1 - i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}