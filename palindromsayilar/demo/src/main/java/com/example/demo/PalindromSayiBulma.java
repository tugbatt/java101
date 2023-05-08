package com.example.demo;

import java.util.Scanner;
public class PalindromSayiBulma {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int palindrom = scanner.nextInt();

        int firstvalue = palindrom;
        int length = String.valueOf(palindrom).length();

        int remainder,value=0;
        for (int i = 0; i<length; i++){

            remainder = palindrom % 10;
            value = value * 10 + remainder;
            palindrom = palindrom /10;
        }
        if(value == firstvalue) {
            System.out.println(value + " is the palindrome number.");
        }
        else {
            System.out.println(value + " is not the palindrome number.");
        }
    }
}