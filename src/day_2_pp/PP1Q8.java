package day_2_pp;
import java.util.Scanner;

public class PP1Q8 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=sc.next( ).charAt(0);
        switch (ch) {
            case 'a':
                count++;
                break;
            case 'e':
                count++;
                break;
            case 'i':
                count++;
                break;
            case 'o':
                count++;
                break;
            case 'u':
                count++;
                break;
            case 'A':
                count++;
                break;
            case 'E':
                count++;
                break;
            case 'I':
                count++;
                break;
            case 'O':
                count++;
                break;
            case 'U':
                count++;
                break;

        }
        if (count==1)
            System.out.println("Entered character "+ch+" is a Vowel");
        else
            System.out.println("Entered character "+ch+" is a Consonent");



    }

    }
