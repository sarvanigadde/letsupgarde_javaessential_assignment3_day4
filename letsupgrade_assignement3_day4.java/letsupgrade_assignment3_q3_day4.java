package com.arrary_q3;

// Create an int array of size 5, take all the values from the user, add all the values and print the sum.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num=new int[5];
        int sum=0;
        System.out.println("Enter five values");
        for(int i=0;i<5;i++){
             num[i]=sc.nextInt();
            sum=sum+num[i];
        }
        System.out.println("sum of all values :"+sum);
    }
}
