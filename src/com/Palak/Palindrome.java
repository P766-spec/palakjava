package com.Palak;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter String1:");
        String s1 ="MADAM";
//        System.out.println("Enter String2:");
        String s2 = "PALAK";
        if(s1== s2){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
