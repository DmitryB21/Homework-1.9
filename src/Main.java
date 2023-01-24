public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 1.9");

        task1();
        task2();
        task3();
        task4();


    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();

        int sum = 0;
        for (int spending : arr) {
            sum = sum + spending;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = 200_001;
        for (int spending : arr) {
            if (spending < min) {
                min = spending;
            }
        }

        int max = 99_999;
        for (int spending : arr) {
            if (spending > max) {
                max = spending;
            }
        }

        System.out.printf("«Минимальная сумма трат за день составила %d рублей. " +
                "Максимальная сумма трат за день составила %d рублей»%n", min, max);

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        float day = 30;
        int sum = 0;
        for (int spending : arr) {
            sum = sum + spending;
        }
        float averageSalary = sum / day;
        System.out.println("Средняя сумма трат за месяц составила " + averageSalary + " рублей");

    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

}