package com.Palak;

public class ReverseString {
    public static void main(String[] args) {
        String result=" ";
        CharSequence string = "whatever";
        for (int i = string.length() -1; i >=0 ; i--) {
            result = result + string.charAt(i);

        }
        System.out.println(result);
    }
}
