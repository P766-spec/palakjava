package com.Palak;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String name = "Disha";
//        char[] ch = new char[name.length()]; //character array
//        for (int i = 0; i < name.length(); i++) {
//            char c = name.charAt(i);
//            ch[i] = c;
//        }
//        System.out.println(Arrays.toString(ch)+"line 14");

        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
