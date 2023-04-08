package com.bridgelabz.basics;

// Selection
// if-else
// if-else-if
// switch
public class Selection {

    public static void main(String[] args) {
        int x = 9;
        System.out.println("main starting");
        if (x >= 10) {
            int z = 0;
            System.out.println(z);
            System.out.println("x>=10");
        } else {
            System.out.println(x);
//            System.out.println(z);
            System.out.println("x<10");
        }
//        System.out.println(z);

        int a = 27;
        int b = 35;
        if (a > 23 && b > 35) {
            System.out.println("a>23 && b>35");
        } else if (a > 23 && b <= 35) {
            System.out.println("a>23 && b<=35");
        } else if (a <= 23 && b <= 35) {
            System.out.println("a<=23 && b<=35");
        } else {

        }

        int z = 4;

        switch (z) {
            case 1:
                System.out.println("case-1");
                break;
            case 2:
                System.out.println("case-2");
                break;
            case 3:
                System.out.println("case-3");
                break;
            case 4:
                System.out.println("case-4");
                break;
            default:
                System.out.println("default");
        }

        char ch = 'a';
        switch (ch) {
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
                break;
            case 'c':
                System.out.println("c");
                break;
            default:
                System.out.println("default");
        }


    }
}
