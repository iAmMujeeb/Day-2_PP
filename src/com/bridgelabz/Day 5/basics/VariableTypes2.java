package com.bridgelabz.basics;

// Static Variable
// Static variable is a class-level variable
// Static variable will get the memory when class loading happens by the class loader.(class loader takes the .class file and loads it into the method area of JVM memory)
// Static variable will be loaded in the method area.
// There will be only one copy of this variable at class level shared to all the members of the class and across all objects.
// If at any point the value of the static variable is changed, it will change for all the members of a class bcoz there is one copy
// It is not mandatory to initialize a static variable. If we are not initializing then it will take default value based on the data type.
// Static variable will be declared inside the class but outside of any of the methods.
// We have to use static keyword for declaring static variable
// Within the same class, static variable can be accessed directly
// Outside a class ,static variable will be accessed using class name or object
public class VariableTypes2 {

    static int x; // 0

    static void m1() {
        System.out.println("m1");
        System.out.println(x); // 30
        x = 40;
        System.out.println(x); // 40
    }

    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(x); // 0
        x = 30;
        System.out.println(x); //30
        m1();
        System.out.println(x); // 40
    }


}
