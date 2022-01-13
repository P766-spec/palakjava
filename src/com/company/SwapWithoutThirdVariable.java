package com.company;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num1:");
        int x = s.nextInt();
        System.out.println("Enter num2:");
        int y =  s.nextInt();
        System.out.println("Before Swapping: "+x+""+y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping:"+x+" "+y);

        System.out.println();
    }




}
