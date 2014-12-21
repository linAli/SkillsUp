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
public class CheckPolindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Input the string: ");
            String myStr = sc.nextLine();
            boolean bl=isPolindrom(myStr);
            if(bl==false)
                System.out.println("This isn\'t a polindrom.");
            else
                System.out.println("This is a polindrom.");
        }
    }    
    static boolean isPolindrom(String str){
        if(str.length()==0)
            return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
