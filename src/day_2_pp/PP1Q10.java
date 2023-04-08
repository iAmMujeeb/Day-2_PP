package day_2_pp;

import java.util.Scanner;

public class PP1Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b = ");
        int b = sc.nextInt();
        System.out.println("Enter the value of b = ");
        int c = sc.nextInt();

        int i = a+b*c;
        int ii = c+a/b;
        int iii = a%b+c;
        int iv = a*b+c;
        int max=i;
        int min=i;
        if (ii>max) {
            max = ii;
        }else if (ii<min) {
            min = ii;
        } else if (iii>max) {
            max = iii;
        } else if (iii<min) {
            min = iii;
        } else if (iv>max) {
            max = iv;
        } else if (iv<min) {
            min = iv;
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);

    }

    }