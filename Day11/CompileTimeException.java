package Day11;

public class CompileTimeException {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Handled Arithmetic Exception");
        }
    }
}
