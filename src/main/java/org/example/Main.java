public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String name = "Ярослав";
        int age = 22;
        double weight = 1.87;
        boolean isEmployed = true;

        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Вага: " + weight);
        System.out.println("Працевлаштований: " + isEmployed);

        if (age < 18) {
            System.out.println("Доступ заборонено");
        } else {
            System.out.println("Доступ дозволено");
        }
        String day = "Monday";

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

        System.out.println("Цикл for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int[] numbers = {3, 7, 10, 15, 20};
        int target = 10;
        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println("Елемент " + target + " знайдено на позиції: " + index);
        } else {
            System.out.println("Елемент " + target + " не знайдено");
        }
    }
    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
