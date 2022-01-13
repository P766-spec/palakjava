package com.company;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {

        Scanner  s = new Scanner(System.in);
        System.out.println("Enter the side of the triangle:");
        double a = s.nextDouble();
        double area = (a*a)/2;
        System.out.println("Area of Isosceles triangle is:" + area);
    }
}
