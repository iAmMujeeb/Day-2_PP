package com.bridgelabz.basics;

// 2 types -> static method
//            non-static method
public class MethodBasics {

    // Method definition
//    static void sumOfNumbers(int num1,int num2){
//        int sum1 = num1 + num2;
//        System.out.println(sum1);
//    }
//
    // creating method for reusing the code
    static int sumOfNumbers(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }

    // JVM calls the main method
    public static void main(String[] args) {

        // Method calling
       int sum1 = sumOfNumbers(34,34);
        System.out.println(sum1);

        int sum2 = sumOfNumbers(sum1,98);
        System.out.println(sum2);
//
//        int x2 = 35;
//        int y2 = 67;
//        int sum2 = x2 + y2;
//        System.out.println(sum2);
    }
}
