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
public class StringToNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the string of numbers: ");
        String str=sc.nextLine();
        System.out.println(getWholeNumber(str));
    }
    static int getWholeNumber(String str){
        int result=0;
        int r=1;
        for(int i=str.length()-1;i>=0;i--){
            result+=getNumber(str.charAt(i))*r;
            r*=10;
        }
        return result;
    }
    static int getNumber(char ch){
       int result=-1;
        switch(ch){
           case '0':
               result=0;
               break;
           case '1':
               result=1;
               break;
           case '2':
               result=2;
               break;
           case '3':
               result=3;
               break;
           case '4':
               result=4;
               break;
           case '5':
               result=5;
               break;
           case '6':
               result=6;
               break;
           case '7':
               result=7;
               break;
           case '8':
               result=8;
               break;
           case '9':
               result=9;
               break;
       }
        return result;
    }
}
