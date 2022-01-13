package com.Palak;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        double dis,amount,markedprice,s;

//        markedprice = 1000;
//        dis = 25; // di 25 means 25%
//        System.out.println("markedprice=" +markedprice);
//        System.out.println("discount rate =" + dis);
//        s = 100 -dis;
//        amount = (s * markedprice)/100;
//        System.out.println("amount after discount is =" +amount);
        Scanner in = new Scanner(System.in);

        System.out.println("enter markedprice:");
        markedprice = in.nextDouble();
        System.out.println("enter discount percentage:");
        dis = in.nextDouble();
        s = 100 -dis;
        amount = (s * markedprice)/100;
        System.out.println("amount after discount is =" +amount);



    }
}
