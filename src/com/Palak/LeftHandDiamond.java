package com.Palak;

import java.util.Scanner;

public class LeftHandDiamond {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.println("Enter rows;");
        int n = s.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int k = n-1;k >=i ; k--) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1; i<=n ; i++) {
            for (int k = 1; k <i ; k++) {
                System.out.print(" ");

            }
            for (int j = n; j>=i ; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
