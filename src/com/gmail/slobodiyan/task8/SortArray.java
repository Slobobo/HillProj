package com.gmail.slobodiyan.task8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SortArray {
    public static void main(String[] args) {
        int[] array = generate(15);
        System.out.print("Initial array: [");
        print(array);

        insertionSort(array);
        System.out.print("Sorted array: [");
        print(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number for search: ");
        int target = scanner.nextInt();

        int result = binarySearch(array, target);
        if (result == -1) {
            System.out.println("Number " + target + " not found in array.");
        } else {
            System.out.println("Index number of " + target + " in sorted array: " + result + ".");
        }

    }

    public static int[] generate(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
        return array;
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

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;


    }
}