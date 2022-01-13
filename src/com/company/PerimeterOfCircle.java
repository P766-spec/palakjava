package com.company;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = s.nextDouble();
        double perimeter = (2* 22*r)/7;
        System.out.println("Perimeter of Circle is:" + perimeter);

  }
}
