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
public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string: ");
        String myStr = sc.nextLine();
        System.out.println("Reverse words: "+reverseWorlds(myStr));
    }
    static String reverseWorlds(String str) {
        String arrayStr[]=str.split(" ");
        String result="";
        for(int i=0;i<arrayStr.length;i++){
            result+=(reverse(arrayStr[i])+" ");
        }
        return result;
    }
    static String reverse(String str){
            String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        return result;
    }
}
