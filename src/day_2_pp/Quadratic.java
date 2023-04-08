package day_2_pp;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double firstroot;
        double secondroot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        Float a = sc.nextFloat();
        System.out.println("Enter the value of b = ");
        Float b = sc.nextFloat();
        System.out.println("Enter the value of b = ");
        Float c = sc.nextFloat();
        double delta = ((b * b) - (4 * a * c));
        if(delta>0) {
            firstroot = (-b + Math.sqrt(delta)) / (2 * a);
            secondroot = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("First Root = %.2f and Second Root = %.2f", firstroot, secondroot);
        } else if (delta==0) {
            firstroot = secondroot = -b / (2 * a);
            System.out.printf("First Root = %.2f and Second Root = %.2f", firstroot, secondroot);
        }else{
            double real = -b/(2*a);
            double imaginary = Math.sqrt(-delta) / (2 * a);
            System.out.printf("First Root = %.2f+%.2fi\n",real,imaginary);
            System.out.printf("Second Root = %.2f-%.2fi",real,imaginary);
        }
    }
}
