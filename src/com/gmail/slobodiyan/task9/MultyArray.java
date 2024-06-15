package com.gmail.slobodiyan.task9;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MultyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of rows and columns: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int[][] array = generate(row, column);
        if (array != null) {
            print(array);
        }

        sumRowOddEven(array);
        multiplyColumnOddEven(array);
        if (isMagicSquare(array)) {
            System.out.println("Array is a magic square. Hooray!!!");
        } else {
            System.out.println("Array is not a magic square. Maybe next time(((");
        }
    }

    public static int[][] generate(int row, int column) {
        if (row <= 0 || column <= 0) {
            System.out.println("Please note, row/column should be above 0. Please provide valid figures!");
            return null;
        } else {
            int[][] array = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    array[i][j] = ThreadLocalRandom.current().nextInt(1, 51);
                }

            }
            return array;
        }
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t ");
            }
            System.out.println();
        }
    }

    public static void sumRowOddEven(int[][] array) {
        int rowEvenResult = 0;
        int rowOddResult = 0;
        int[][] rowIndices = new int[2][array.length];
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            if (i % 2 == 0) {
                rowEvenResult += rowSum;
                rowIndices[0][evenCount++] = i;
            } else {
                rowOddResult += rowSum;
                rowIndices[1][oddCount++] = i;
            }
        }
        System.out.print("Sum of even rows (row ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(rowIndices[0][i]);
            if (i < evenCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("): " + rowEvenResult);

        System.out.print("Sum of odd rows (row ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(rowIndices[1][i]);
            if (i < oddCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("): " + rowOddResult);
    }

    public static void multiplyColumnOddEven(int[][] array) {
        long columnEvenResult = 1;
        long columnOddResult = 1;
        int[][] columnIndices = new int[array[0].length][2];
        int evenCount = 0;
        int oddCount = 0;

        for (int j = 0; j < array[0].length; j++) {
            int columnProduct = 1;
            for (int i = 0; i < array.length; i++) {
                columnProduct *= array[i][j];
            }
            if (j % 2 == 0) {
                columnEvenResult *= columnProduct;
                columnIndices[evenCount++][0] = j;
            } else {
                columnOddResult *= columnProduct;
                columnIndices[oddCount++][1] = j;
            }
        }
        System.out.print("Product of even columns (column ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(columnIndices[i][0]);
            if (i < evenCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.printf("): %,d%n", columnEvenResult);

        System.out.print("Product of odd columns (column ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(columnIndices[i][1]);
            if (i < oddCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.printf("): %,d%n", columnOddResult);
    }

    public static boolean isMagicSquare(int[][] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i].length != n) {
                return false;
            }
        }
        boolean[] seen = new boolean[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = array[i][j];
                if (num < 1 || num > n * n || seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }
        int magicConstant = n * (n * n + 1) / 2;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int columnSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += array[i][j];
                columnSum += array[j][i];
            }
            if (rowSum != magicConstant || columnSum != magicConstant) {
                return false;
            }
        }
        int diagonalLeftSum = 0;
        int diagonalRightSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalLeftSum += array[i][i];
            diagonalRightSum += array[i][n - 1 - i];
        }
        if (diagonalLeftSum != magicConstant || diagonalRightSum != magicConstant) {
            return false;
        }
        return true;
    }

}