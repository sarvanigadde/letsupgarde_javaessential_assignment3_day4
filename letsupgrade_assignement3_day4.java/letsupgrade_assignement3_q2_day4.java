package com.arrary_q2;

//Create an int array with 5 values and print only odd values.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int[] num = new int[5];
        System.out.println("Enter five numbers");
        for(int i=0;i<5;i++){
            num[i]=sc.nextInt();
            if(num[i]%2!=0) {
                System.out.println("odd value in an array:"+num[i]);
            }
        }
    }
}
