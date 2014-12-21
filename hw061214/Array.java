/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw061214;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author therioyo
 */
public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the array's size: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000000);
        }
        printArray(array);
        int min = findMin(array);
        int max = findMax(array);
        System.out.println("Min: " + min + " Max: " + max);
        sort(array);
        printArray(array);
        //Arrays.sort(array);
        System.out.print("Input the number to find: ");
        int number = sc.nextInt();
        int index = findNumber(array, number);
        if (index == -1) {
            System.out.println("Number is not exist!");
        } else {
            System.out.println("Number " + number + " has index: " + index);
        }
        int binaryIndex = binaryFindNumber(array, number, 0, array.length - 1);
        if (binaryIndex == -1) {
            System.out.println("Number is not exist!");
        } else {
            System.out.println("Number " + number + " has index: " + binaryIndex);
        }
        mix(array);
        printArray(array);
    }

    static int findMin(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static void printArray(int array[]) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static void sort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
    }

    private static int findNumber(int[] array, int number) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                result = i;
            }
        }
        return result;
    }

    private static int binaryFindNumber(int[] array, int number, int start, int end) {
        int result = -1;
        int middle = (end + start) / 2;
        if (array[middle] > number && start < end) {
            result = binaryFindNumber(array, number, start, middle - 1);
        } else if (array[middle] < number && start < end) {
            result = binaryFindNumber(array, number, middle + 1, end);
        }
        if (array[middle] == number) {
            return middle;
        }
        return result;
    }

    private static void mix(int[] array) {
        Random rd = new Random();
        for (int i = 1; i < array.length; i++) {
            int j = rd.nextInt(i);
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}
//мне сказали что тут нельзя написать ничего!! ха-ха!! а я взяла и написала целую строчку!!! вот так вот!
