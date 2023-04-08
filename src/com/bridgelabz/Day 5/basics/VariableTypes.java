package com.bridgelabz.basics;


// 3 types
// Local variable , instance variable , static variable

// Local variable
// Variable declared within a method or a block is called local variable
// The scope of local variable is within the method or block in which it is declared
// It is mandatory to initialize local variable otherwise we get error

public class VariableTypes {

    static void m2(int x) {
        System.out.println(x);
    }

    static void m1() {
        int x = 23;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        m1();
        m2(34);
    }
}
