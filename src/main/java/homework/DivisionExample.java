package homework;

public class DivisionExample {
    public static void main(String[] args) {
        divide(10, 0);
        divide(16, 8);
    }

    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("На нуль ділити не можна");
        }
    }
}
