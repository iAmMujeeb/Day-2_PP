package com.bridgelabz.basics;

// HelloWorld.java is a source file containing the source code
// .java file(source code) is given to compiler(present in JDK).
// The compiler converts the source code into bytecode(.class file)
// This byte code(.class file) is loaded into the JVM memory(method area) by class loader
// This byte code is interpreted into machine readable code
// This machine readable code is finally executed when JVM calls the main method.

public class HelloWorld {

    // JDK - Java Development kit
    // JRE - Java Runtime Environment
    // JVM - Java Virtual Machine

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("abc");
        int x = 10;
        System.out.println(x);
    }
}
