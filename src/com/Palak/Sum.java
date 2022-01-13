package com.Palak;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//      int ans =  sum2(); // calling the function
//        System.out.println(ans);

        int ans = sum3(20 , 30);
        System.out.println(ans);
    }
     //pass the value of numbers when you are calling the method in main()

    static int sum3(int a , int b) {
        int sum = a + b;
        return sum;
    }
    // return the value void will not come  now


    static  int  sum2(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = s.nextInt();
        System.out.print("Enter number 2:");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        return sum;   //the function is over here

    }
   static  void sum() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = s.nextInt();
        System.out.print("Enter number 2:");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum =" +sum);
    }
    /*
    return_type name(arguments) {
      // body
      return statement;
      }
     */
}
