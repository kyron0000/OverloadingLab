package com.company;

public class App {
    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers.
     */
    //This method takes in two int parameters to add.
   public static int computeSum(int num1, int num2) {
        return num1 + num2;
    }
    //This method takes in 3 int parameters to add.
  public static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    //Create method that returns the greater integer value
  public static int greaterValue(int num1,int num2){
        if (num1 > num2){
            return num1;
        }
        else {
            return num2;
        }
    }
    //Create method that returns the greater double value
   public static double greaterValue(double num1,double num2){
        if (num1 > num2){
            return num1;
        }
        else {
            return num2;
        }
    }

}
