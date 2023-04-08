package day_2_pp;

import java.util.Scanner;

public class PP1Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();
        int mun =0;
        System.out.println("Original  Number: " + num);

        for (int i=num; i>0;) {
            int digit = i % 10;
            mun = mun * 10 + digit;
            i = i / 10;
        }

        System.out.println("Reversed Number: " + mun);
        if (num == mun)
            System.out.println(num+" is a Palindrom Number");
        else
            System.out.println(num+ " is not a Palindrom Number");

    }
}