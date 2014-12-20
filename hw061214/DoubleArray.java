/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw061214;

import java.util.Scanner;

/**
 *
 * @author therioyo
 */
public class DoubleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the array's size: ");
        int size = sc.nextInt();
        int array[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for(int j=0; j<size;j++){
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        printArray(array);
        System.out.println("Product between [10; 25]: "+product(array));
        printArray(array);
    }
    static void printArray(int array[][]) {
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            for(int j=0; j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static int product(int array[][]){
        int result=1;
        for (int i = 0; i < array.length; i++) {
            for(int j=0; j<array[i].length;j++){
               if(array[i][j]>=10&&array[i][j]<=25){
                   result*=array[i][j];
               }
            }
        }
        return result;
    }
}
