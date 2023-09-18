import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] expenses = generateRandomArray();
        int sum = 0;
        for (int expens : expenses) {
            sum += expens;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        int[] expenses = generateRandomArray();
        int maxExpense = expenses[0];
        int minExpense = 200000;
        for (int expens : expenses) {
            if (expens > maxExpense) {
                maxExpense = expens;
            }
            if (expens < minExpense) {
                minExpense = expens;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей.");
    }

    public static void task3() {
        int[] expenses = generateRandomArray();
        double avrg = 0;
        for (int expens : expenses) {
            avrg += expens;
        }
        avrg = avrg / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + avrg + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(reverseFullName[i]);
                break;
            }
            System.out.print(reverseFullName[i]);
        }
    }
}

