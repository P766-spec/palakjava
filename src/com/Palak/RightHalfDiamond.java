package com.Palak;

import java.util.Scanner;

public class RightHalfDiamond {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.println("Enter rows:");
        int n = s.nextInt();

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <i+1 ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }
//        for (int i = 1; i <n ; i++) {
//            for(int j = i ; j<n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = n; i >=1 ; i--) {
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
