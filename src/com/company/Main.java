package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double even = 0, odd = 0, sum = 0;
        int counter = 0, input = 0;
        int small = 0, large = 0;

        System.out.print("Enter a series of numbers (input ends if it is 0): ");

        Scanner in = new Scanner(System.in);
        while ((input = in.nextInt()) != 0){
            small = Integer.min(small, input);
            large = Integer.max(large, input);
            sum += input;
            counter++;

            if(input % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        if(counter > 0){
            double average = sum/counter;
            System.out.println("The smallest integer is: " + small);
            System.out.println("The larger integer is: " + large);
            System.out.println("Total numbers entered: " + counter);
            System.out.println("Total even numbers entered: " + (int)even);
            System.out.println("Total odd numbers entered: " + (int)odd);
            System.out.println("The average value is: " + average);
        }else
            System.out.println("No data entered!");
    }
}
