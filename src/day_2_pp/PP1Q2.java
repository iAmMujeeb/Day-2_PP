package day_2_pp;

import java.util.Scanner;
public class PP1Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        if (num == 1)
            System.out.println("Unit");
        else if (num == 10)
            System.out.println("Ten");
        else if (num == 100)
            System.out.println("Hundred");
        else if (num == 1000)
            System.out.println("Thousand");
        else
            System.out.println("Wrong Number");
    }
}
