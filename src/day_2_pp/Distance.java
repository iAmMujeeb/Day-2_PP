package day_2_pp;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        int x = sc.nextInt();
        System.out.println("Enter the value of b = ");
        int y = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Distance from (0, 0) to (" + x + ", " + y + ") is " + distance);
    }
}
