package com.Palak;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 5;
        for( int i=1; i<= n;i++){
            for( int k = n-1; k>i;i--){
                System.out.println(" ");
            }
            for( int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();


        }
    }
}
