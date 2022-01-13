package com.Palak;

import java.util.Scanner;

public class
MultiDimension {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int [ ] [ ] arr =  new int[3] [2] ;
//        System.out.println(arr.length); // no of rows
//        //input
//
        for(int row = 0; row < arr.length; row++){
            // for each column in every row
            for(int col = 0; col<arr[row].length; col++){
                arr[row] [col] = s.nextInt();
            }
        }

    }
}
