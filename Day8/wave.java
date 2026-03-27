import java.util.*;

public class wave {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            sb1.append(str.charAt(i));
        }
        for (int i = 1; i < str.length(); i += 2) {
            sb2.append(str.charAt(i));
        }
        sb1.append(sb2);
        System.out.println("Waveform string: " + sb1);
    }
}