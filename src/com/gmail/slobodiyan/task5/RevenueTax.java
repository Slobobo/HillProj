package com.gmail.slobodiyan.task5;

import java.util.Scanner;

public class RevenueTax {
    public static void main(String[] args) {
        double taxPayment;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть свій річний дохід");
        double income = scanner.nextDouble();
        if (income < 0) {
            System.out.println("Дохід не може бути від’ємним. Введіть коректне значення.");
        } else if (income <= 10000) {
            taxPayment = income * 0.025;
            System.out.printf("Податок з доходу становить: %.2f.", taxPayment);
        } else if (income <= 25000) {
            taxPayment = income * 0.043;
            System.out.printf("Податок з доходу становить: %.2f.", taxPayment);
        } else {
            taxPayment = income * 0.067;
            System.out.printf("Податок з доходу становить: %.2f.", taxPayment);
        }
    }
}
