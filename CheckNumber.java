package com.java;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = in.nextInt();

        if (n < 0){
            System.out.println("The number is negative");
        }
        else if (n == 0){
            System.out.println("The number is zero");
        }
        else {
            System.out.println("The number is positive");
        }
    }
}
