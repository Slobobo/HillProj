package com.gmail.slobodiyan.task6;

import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число для знаходження суми чисел в послідовності");
        int limit = scanner.nextInt();

        int sumFor = 0;
        for (int i = 1; i <= limit; i++) {
            sumFor += i;
            System.out.println("Num is " + i + " sum is " + sumFor);
        }

        int a = 1;
        int sumDo = 0;
        do {
            sumDo += a;
            System.out.println("Num is " + a + " sum is " + sumDo);
            a++;
        } while (a <= limit);

        int b = 1;
        int sumWhile = 0;
        while (b <= limit) {
            sumWhile += b;
            System.out.println("Num is " + b + " sum is " + sumWhile);
            b++;
        }
    }

}
