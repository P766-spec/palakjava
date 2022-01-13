package com.company;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {

        Scanner  s = new Scanner(System.in);
        System.out.println("Enter the length of  pyramid:");
         float l =s.nextFloat();
        System.out.println("Enter the width of pyramid:");
        float w = s.nextFloat();
        System.out.println("Enter the height of pyramid:");
        float h = s.nextFloat();
        double volume = (l*w*h)/3;
        System.out.println("Volume  is : " + volume);
    }
}
