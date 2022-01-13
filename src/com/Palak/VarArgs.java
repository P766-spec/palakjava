package com.Palak;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun( 67);                           // function Overloading
       fun("Palak Mantri");
    }
     static void fun(int a){
         System.out.println("first one");
         System.out.println(a);

    }
    static void fun(String name) {
        System.out.println("second one");
        System.out.println(name);
    }








}
