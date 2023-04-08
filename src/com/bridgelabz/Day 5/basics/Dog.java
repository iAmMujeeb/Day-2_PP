package com.bridgelabz.basics;

public class Dog {
    //String is a predefined class in java
    // Non-primitive data type

    // A special method having same name as class name is called as constructor
    // A constructor is used to initialize an object.
    // If we are not creating a constructor inside the class , the compiler will create a default constructor
    // If we are creating any kind of constructor inside the class , then compiler will not create any constructor.
//    public Dog(){
//
//    }

    String breed;
    int age;
    String color;


    // non-static method / Object-level method
    void eat() {
        System.out.println("eat");
    }
}
