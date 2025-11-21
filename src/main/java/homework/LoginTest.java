package homework;

public class LoginTest {
    public static void main(String[] args) {

        String expected = "Login successful";
        String actual = "Login successful"; //Login failed

        if (expected.equals(actual)) {
            System.out.println("Тест пройдено");
        } else {
            System.out.println("Тест не пройдено");
        }
    }
}
