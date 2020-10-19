//create a class avenger with
//properties (name,age,power,weapon,planet) and with
//functions-getDetails() and displayDetails().
//create 5 objects as an array in the main method and call.

package com.arrary_q1;

import java.util.Scanner;
public class Avenger {
    String name,power,weapon,planet;
    int age;
    Scanner sc = new Scanner(System.in);
    public void getDetails(){
        System.out.println("enter name:");
        name =sc.next();
        System.out.println("enter age:");
        age =sc.nextInt();
        System.out.println("enter power:");
        power =sc.next();
        System.out.println("enter weapon:");
        weapon =sc.next();
        System.out.println("enter planet:");
        planet =sc.next();

    }
    public void displayDetails(){
        System.out.println("The name is "+name+",Age "+age+",power "+power+",weapon "+weapon+",planet "+planet+".");
    }
}


public class Main {

    public static void main(String[] args) {

        Avenger[] avengers = new Avenger[5];
        // create objection and function calling
        for (int i = 0; i < 5; i++) {
            avengers[i] = new Avenger();
            avengers[i].getDetails();

        }
        for (int i = 0; i < 5; i++) {
            avengers[i].displayDetails();
        }
    }
}