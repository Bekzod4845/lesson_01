package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerNum = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        System.out.println("matin  = ");
        String s = scannerStr.nextLine();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
           
            System.out.print( Character.toUpperCase(chars[i]));
        }



    }
}