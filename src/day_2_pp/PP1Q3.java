package day_2_pp;

import java.util.Scanner;
public class PP1Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n)
        {
            sum = sum + i;
            i++;
        }
        System.out.print("Sum of the number: " +sum);

    }
}