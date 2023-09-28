//1. Write a program to find the sum of even numbers between 25 to 51
//Bikram Koley


package com.assignment;

public class Program1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 26; x <= 51; x++) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println("The sum of even numbers between 25 to 51 is : " +sum);
    }
}
