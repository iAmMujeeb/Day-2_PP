package day_2_pp;

import java.util.Scanner;
public class PP1Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single digit number: ");
        int num = scanner.nextInt();
        if (num == 0)
            System.out.println("Your number is Zero");
        else if (num == 1)
            System.out.println("Your number is One");
        else if (num == 2)
            System.out.println("Your number is Two");
        else if (num == 3)
            System.out.println("Your number is Three");
        else if (num == 4)
            System.out.println("Your number is Four");
        else if (num == 5)
            System.out.println("Your number is Five");
        else if (num == 6)
            System.out.println("Your number is Six");
        else if (num == 7)
            System.out.println("Your number is Seven");
        else if (num == 8)
            System.out.println("Your number is Eight");
        else if (num == 9)
            System.out.println("Your number is Nine");
        else
            System.out.println("Wrong Number");
        }
    }

