package com.java;

import java.util.Scanner;

public class EligibleForDonateBlood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:- ");
        int age = sc.nextInt();
        System.out.println("Enter your weight:- ");
        int weight = sc.nextInt();

        if (age > 25 && weight > 48){
            System.out.println("You are eligible for donating blood");
        } else{
            System.out.println("You are not eligible for donating blood");
        }

    }
}
