package day_2_pp;

import java.util.Scanner;

public class PP1Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();
        int mun = 0;
        System.out.println("Original  Number: " + num);

        while(num != 0) {

            int digit = num % 10;
            mun = mun * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number: " + mun);

    }
}
