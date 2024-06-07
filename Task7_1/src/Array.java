import java.util.concurrent.ThreadLocalRandom;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 101);
        }

        System.out.print("Елементи масиву: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        belowZero(array);
        even(array);
        odd(array);
        min(array);
        max(array);
        averageAfterNegative(array);

    }

    public static void belowZero(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number < 0) {
                sum += number;
            }

        }
        System.out.println("Сума всіх від’ємних чисел в масиві: " + sum);

    }

    public static void even(int[] array) {
        int even = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                even++;
            }

        }
        System.out.println("Кількість парних чисел: " + even);

    }

    public static void odd(int[] array) {
        int odd = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                odd++;
            }

        }
        System.out.println("Кількість непарних чисел: " + odd);
    }

    public static void min(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
    }

    public static void max(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");

    }

    public static void averageAfterNegative(int[] array) {
        int sumAfterNeg = 0;
        int count = 0;
        boolean findNegative = false;

        for (int number : array) {
            if (findNegative) {
                sumAfterNeg += number;
                count++;
            } else if (number < 0) {
                findNegative = true;
            }
        }

        if (count > 0) {
            double averAfterNeg = (double) sumAfterNeg / count;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", averAfterNeg);
        } else {
            System.out.println("В масиві відсутнє від'ємне число або перше/єдине відємне число є останнім елементом масиву.");
        }
    }
}


