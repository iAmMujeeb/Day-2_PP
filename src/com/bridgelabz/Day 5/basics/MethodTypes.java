package com.bridgelabz.basics;


// 2 types => static and non-static

public class MethodTypes {

    static int x = 12;

    int y = 13;

    // static method / class-level method
    static void m1() {
        // Inside static method object level variables cannot be accessed directly
//        System.out.println(y);
        MethodTypes obj = new MethodTypes(); // -> y
        System.out.println(obj.y); // 13
        System.out.println("m1");
        System.out.println(x); // 56
        x = 89;
        System.out.println(x); // 89
    }

    // non-static method / instance method / object-level method
    void m2() {
        int y = 45;
        System.out.println("m2");
        System.out.println(x); // 89
        x = 78;
        System.out.println(x); // 78
        // Inside object-level method , object-level variable can be accessed directly
        System.out.println(y); // 10 // 13
        // this keyword refers to the current object
        System.out.println(this.y);

    }

    // JVM calls main method
    public static void main(String[] args) {

        System.out.println(x); // 12
        x = 56;
        System.out.println(x); // 56
        MethodTypes obj1 = new MethodTypes();  // Heap area  -> y
        System.out.println(obj1.y); // 13
        obj1.y = 35;
        System.out.println(obj1.y); // 35

        System.out.println(obj1.x); // 56

        MethodTypes obj2 = new MethodTypes(); // -> y
        System.out.println(obj2.y); // 13
        System.out.println(obj2.y); // 13

        System.out.println(obj2.x); // 56

        System.out.println("**********************");

        System.out.println(x); // 56
        m1();
        System.out.println(x); // 89

        MethodTypes obj3 = new MethodTypes(); // -> y
        System.out.println(obj3.y); // 13
        obj3.y = 10;
        obj3.m2();
        System.out.println(obj3.y);
        System.out.println(x);

        obj2.m2();


    }
}
