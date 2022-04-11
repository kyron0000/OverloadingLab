package com.company;

public class Main {


    public static void main(String[] args) throws Exception {

         //Create Method calls that takes in 2 parameters, and 3 parameters
         //respectively and computes their sum.
        System.out.println("The sum of 69 and 31 is "+ App.computeSum(69,31));
        System.out.println("The sum 13,26 and 30 is " + App.computeSum(13,26,30));
         //Call the greaterValue method with integer parameters
        System.out.println("The greater value between 45 and 100 is " + App.greaterValue(45,100));

         // Call the greaterValue method with double parameters
        System.out.println("The greater value between 3.14 and 9.8 is " + App.greaterValue(3.14,9.8));

    }
}
