package com.Palak;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        String personalised = myGreet("Palak Mantri");
        System.out.println(personalised);

    }

    private static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting =  " how are you";
        return greeting;
    }
}
