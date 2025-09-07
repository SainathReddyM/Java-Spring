package com.msr;


public class CoreBasic {
    public static void main(String[] args) {
        int sum = 0;
        int max = 5;
        for (int i = 1; i <= max; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first " + max + " natural numbers is: " + sum);
    }
}