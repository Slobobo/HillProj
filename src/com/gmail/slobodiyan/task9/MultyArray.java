package com.gmail.slobodiyan.task9;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MultyArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of rows and columns: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int[][] matrix = generate(row, column);
        if (matrix != null) {
            print(matrix);
        }

        sumRowOddEven(matrix);
        productColOddEven(matrix);

        if (isMagicSquare(matrix)) {
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
            int[][] matrix = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 51);
                }

            }
            return matrix;
        }
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t ");
            }
            System.out.println();
        }
    }

    public static int sumAllRow(int[][] matrix, int initial, int[] rowIndices) {
        int sum = 0;
        int count = 0;

        for (int i = initial; i < matrix.length; i += 2) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            sum += rowSum;
            rowIndices[count++] = i;
        }
        return sum;
    }

    public static void sumRowOddEven(int[][] matrix) {

        int[] evenIndices = new int[matrix.length / 2 + matrix.length % 2];
        int[] oddIndices = new int[matrix.length / 2];
        int evenSum = sumAllRow(matrix, 0, evenIndices);
        int oddSum = sumAllRow(matrix, 1, oddIndices);
        System.out.print("Sum of even rows (row ");
        printRowIndices(evenIndices);
        System.out.println("): " + evenSum);

        System.out.print("Sum of odd rows (row ");
        printRowIndices(oddIndices);
        System.out.println("): " + oddSum);
    }

    public static void printRowIndices(int[] rowIndices) {
        for (int i = 0; i < rowIndices.length; i++) {
            if (rowIndices[i] != 0 || i == 0) {
                System.out.print(rowIndices[i]);
                if (i < rowIndices.length - 1 && rowIndices[i + 1] != 0) {
                    System.out.print(", ");
                }
            }
        }
    }

    public static long productAllColumn(int[][] matrix, int initial, int[] colIndices) {
        long product = 1;
        int count = 0;

        for (int j = initial; j < matrix[0].length; j += 2) {
            int columnProduct = 1;
            for (int i = 0; i < matrix.length; i++) {
                columnProduct *= matrix[i][j];
            }
            product *= columnProduct;
            colIndices[count++] = j;
        }
        return product;
    }

    public static void productColOddEven(int[][] matrix) {
        int[] evenIndices = new int[matrix[0].length / 2 + matrix[0].length % 2];
        int[] oddIndices = new int[matrix[0].length / 2];

        long evenProduct = productAllColumn(matrix, 0, evenIndices);
        long oddProduct = productAllColumn(matrix, 1, oddIndices);
        System.out.print("Product of even columns (column ");
        printColIndices(evenIndices);
        System.out.println("): " + evenProduct);

        System.out.print("Product of odd columns (column ");
        printColIndices(oddIndices);
        System.out.println("): " + oddProduct);
    }

    public static void printColIndices(int[] collIndices) {
        for (int i = 0; i < collIndices.length; i++) {
            if (collIndices[i] != 0 || i == 0) {
                System.out.print(collIndices[i]);
                if (i < collIndices.length - 1 && collIndices[i + 1] != 0) {
                    System.out.print(", ");
                }
            }
        }
    }

    public static int sumRow(int[][] matrix, int row) {
        int sum = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            sum += matrix[row][i];
        }
        return sum;
    }

    public static int sumColumn(int[][] matrix, int column) {
        int sum = 0;
        for (int j = 0; j < matrix.length; j++) {
            sum += matrix[j][column];
        }
        return sum;
    }

    public static int sumMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static int sumSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }


    public static boolean isMagicSquare(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }
        int n = matrix.length;
        int magicConstant = sumRow(matrix, 0);

        for (int i = 1; i < n; i++) {
            if (sumRow(matrix, i) != magicConstant) {
                return false;
            }
        }

        for (int j = 0; j < n; j++) {
            if (sumColumn(matrix, j) != magicConstant) {
                return false;
            }
        }
        return sumMainDiagonal(matrix) == magicConstant && sumSecondaryDiagonal(matrix) == magicConstant;

    }
}


