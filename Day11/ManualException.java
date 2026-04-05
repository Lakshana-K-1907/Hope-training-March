package Day11;

public class ManualException {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new RuntimeException("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        checkAge(16);
    }
}
