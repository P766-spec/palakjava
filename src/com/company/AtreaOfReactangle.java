package com.company;

import java.util.Scanner;

public class AtreaOfReactangle {
    public static void main(String[] args) {

        Scanner  s = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double l = s.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double b = s.nextDouble();
        double area = (l*b);
        System.out.println("Area of Rectangle is:" + area);
    }

}
