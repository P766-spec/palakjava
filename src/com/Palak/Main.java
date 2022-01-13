package com.Palak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q: take input of 2 numbers and print the sum
//        Scanner  s = new Scanner(System.in);
//        System.out.print("Enter number 1:");
//        int num1 = s.nextInt();
//        System.out.print("Enter number 2:");
//        int num2 = s.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum =" +sum);

        Scanner  s = new Scanner(System.in);

        int num1, num2, sum; // do this 100 times we will not copy paste

        System.out.print("Enter number 1:");
        num1 = s.nextInt();
        System.out.print("Enter number 2:");
        num2 = s.nextInt();
       sum = num1 + num2;
        System.out.println("The sum =" +sum);
    }
}
