package com.gmail.slobodiyan.task7;

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
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + array[minIndex] + " (з індексом " + minIndex + ")");
    }

    public static void max(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;

            }
        }
        System.out.println("Найбільший елемент: " + array[maxIndex] + " (з індексом " + maxIndex + ")");

    }

    public static void averageAfterNegative(int[] array) {
        int firstNegativeIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        if (firstNegativeIndex != -1) {
            int sum = 0;
            int count = 0;
            for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                sum += array[i];
                count++;
            }
            if (count > 0) {
                double average = (double) sum / count;
                System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", average);
            } else {
                System.out.println("В масиві відсутнє від'ємне число або перше/єдине відємне число є останнім елементом масиву.");
            }
        }
    }
}


