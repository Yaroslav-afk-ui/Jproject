package homework;

public class Task5 {
    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {3, 7, 10, 15, 20};
        int target = 10;

        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println("Елемент " + target + " знайдено на позиції: " + index);
        } else {
            System.out.println("Елемент " + target + " не знайдено");
        }
    }
}