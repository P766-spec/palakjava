package com.Palak;

public class Shadowing {
    static int x = 90 ; // higher variable will be hidden , this will  be shadowed at line 9
  // int x --> declaring the varible
    // x = 50 --> initializing the variable
    // scope will begin when value is initialized
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40; // the class variable at line 4 is shadowed by this
        System.out.println(x); // 40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
