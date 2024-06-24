package com.gmail.slobodiyan.task10;

public class VariousMethods {
    public static void main(String[] args) {

        int number = 5;
        square(number);

        double radius = 3.5;
        double height = 10.0;
        volumeCylinder(radius, height);

        int[] array = {10, 20, 30, 40, 50};
        System.out.print("3.Array: [");
        print(array);
        sumArray(array);

        String initialLine = "Hello, World!";
        reverseString(initialLine);

        int base = 2;
        int exponent = 3;
        exponentiation(base, exponent);

        int numberRetry = 4;
        String line = "I love Java!";
        printMessage(numberRetry, line);

    }

    public static int square(int number) {
        System.out.println("1.Please enter an integer: " + number);
        int result = number * number;
        System.out.println("Square of " + number + " equals " + result + ".");
        System.out.println();
        return result;
    }

    public static double volumeCylinder(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            System.out.println("Error!!! Radius and height should be above 0.");
            System.out.println();
            return -1;
        } else {
            double volume = Math.PI * radius * radius * height;

            System.out.println("2.Volume of cylinder with radius " + radius + " and high " + height + " equals " + volume + ".");
            System.out.println();
            return volume;
        }
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Total sum of array equals " + sum + ".");
        System.out.println();
        return sum;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static char[] reverseString(String str) {
        if (!str.isEmpty()) {
            System.out.print("4. Please enter line: ");
            System.out.println(str);
            System.out.print("Reversed line: ");
            char[] charArray = str.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
                System.out.print(charArray[i]);
            }
            System.out.println();
            System.out.println();
            return charArray;
        } else {
            System.out.println("ERROR!!! Please enter valid line!!!");
            return "".toCharArray();
        }
    }

    public static int exponentiation(int base, int exponent) {

        System.out.println("5. Please enter a: " + base);
        System.out.println("Please enter b: " + exponent);

        double initialResult = Math.pow(base, exponent);
        int finalResult = (int) Math.round(initialResult);
        System.out.println("Result " + base + "^" + exponent + " equals " + finalResult + ".");
        System.out.println();
        return finalResult;
    }

    public static void printMessage(int numberRetry, String text) {

        System.out.println("6. Please enter n: " + numberRetry);
        System.out.println("Please enter text: " + text);

        for (int i = 0; i < numberRetry; i++) {
            System.out.println(text);
        }

    }

}