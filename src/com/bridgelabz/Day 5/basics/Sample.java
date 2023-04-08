package com.bridgelabz.basics;

public class Sample {

    static int y = 10;

    public static void main(String[] args) {

        System.out.println(VariableTypes2.x); // 0
        VariableTypes2.x = 45;
        System.out.println(VariableTypes2.x); // 45

        System.out.println(y);

        VariableTypes3 obj = new VariableTypes3();
        System.out.println(obj.x);

        System.out.println(VariableTypes3.y);
        System.out.println(obj.y);

    }

}
