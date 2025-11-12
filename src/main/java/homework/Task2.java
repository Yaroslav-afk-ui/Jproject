package homework;

public class Task2 {
    public static void main(String[] args) {   // ← ось головний метод, який запускається

        String name = "Ярослав";
        int age = 22;
        double weight = 80.87;
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
    }
}