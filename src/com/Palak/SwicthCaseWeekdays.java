package com.Palak;

import java.util.Scanner;

public class SwicthCaseWeekdays {
    public static void main(String[] args) {
        Scanner  s = new  Scanner(System.in);

//        int day = s.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
//            case 6, 7-> System.out.println("Weekends");
//        }
        int empID = s.nextInt();
        String department = s.nextLine();
        switch (empID){
            case 1 -> System.out.println("Palak Mantri");
            case 2 -> System.out.println("Vaishnavi Patil");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch(department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                 }
            }
             default -> System.out.println("Enter correct empID");
        }

    }
}
