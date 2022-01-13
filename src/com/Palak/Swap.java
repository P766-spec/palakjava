package com.Palak;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a; // in java to swap the number we use temp
//        a = b;
//        b = temp;
        swap(a, b);  // does not swap it why?
        System.out.println(a +" " +b);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
