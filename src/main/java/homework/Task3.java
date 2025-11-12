package homework;

public class Task3 {
    public static void main(String[] args) {
        String[] days ={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Перевірка днів тижня");

        for (String day : days) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.println("Робочий день");
                    break;
                case "Saturday":
                case "Sunday":
                    System.out.println("Вихідний день");
                    break;
                default:
                    System.out.println("Невідомий день");
            }
        }
    }
}