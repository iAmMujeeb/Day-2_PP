package com.bridgelabz.basics;


// Instance Variable
// Instance variable is an object-level variable
// Instance variable will get the memory when Object is created and memory is allocated.
// Instance variable will be loaded in the heap area
// There will be only one copy of this variable at object level and it is independent of other objects.
// Within the same class or outside the class, instance variable can be accessed through object only.
// If at any point the value of the instance variable is changed, it will change only for that object
// It is not mandatory to initialize an instance variable. If we are not initializing then it will take default value based on the data type.
// Instance variable will be declared inside the class but outside of any of the methods.
public class VariableTypes3 {

    int x = 10;

    static int y = 23;

    public static void main(String[] args) {

        // Dog dog1 => reference of Dog class
        // new Dog(); => Object of Dog class
        // All the objects are stored in the heap area
        Dog dog1 = new Dog(); // object gets created at run-time
        System.out.println(dog1.age); // 0
        System.out.println(dog1.breed); // null
        System.out.println(dog1.color); // null
        dog1.age = 4;
        System.out.println(dog1.age); // 4
        System.out.println();

        Dog dog2 = new Dog();
        System.out.println(dog2.age); // 0
        System.out.println(dog2.breed);
        System.out.println(dog2.color);

        dog2.color = "brown";
        System.out.println(dog2.color); // brown
        System.out.println(dog1.color); // null


        System.out.println("***************");
        dog1.eat();

    }


}
