package com.Palak;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fruit = s.next();

//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Oranges":
//                System.out.println("A round fruit");
//                break;
//            case " Grapes":
//                System.out.println("A small fruit");
//                break;
//            default:
//                System.out.println("This is in valid fruit:");
//                break;
//        }

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Oranges" -> System.out.println("A round fruit");
            case " Grapes" -> System.out.println("A small fruit");
            default -> System.out.println("This is in valid fruit:");
        }

    }
}
