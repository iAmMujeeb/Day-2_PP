package day_2_pp;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        int temp = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m = ");
        int m = sc.nextInt();
        System.out.println("Enter the value of d = ");
        int d = sc.nextInt();//(m = 3, d=20) (m = 6, d = 20)
        if (m == 3) {
            if (d >= 20 && d <= 31) {
                System.out.println("True");
                temp = 1;
            }else
                System.out.println("False");
         }
        if (m == 4) {
            if (d >= 1 && d <= 31) {
                System.out.println("True");
                temp = 1;
            }
            else
                System.out.println("False");
        }
        if (m == 5) {
            if (d >= 1 && d <= 31){
                System.out.println("True");
                temp = 1;
            }
            else
                System.out.println("False");
        }
        if (m == 6) {
            if (d >= 1 && d <= 20) {
                System.out.println("True");
                temp = 1;
            }
            else
                System.out.println("False");
        }
        if(temp==0) {
            System.out.println("False");
        }
    }
}
//        if((temp1 == 1) && (temp2 == 1))
//            System.out.println("True");
//        else
//            System.out.println("False");
//    }
//}




















//        if (m >= 3) {
//            if (d >= 20 && d <= 31)
//                temp1 = 1;
//        }
//        if (m <= 6) {
//            if (d >= 1 && d <= 20)
//                temp2 = 1;
//        }
//        if((temp1 == 1) && (temp2 == 1))
//            System.out.println("True");
//        else
//            System.out.println("False");
//    }
//}










//        if((m>=3 && d>=20 && d<=31)) {
//            temp1 = 1;
//        }
//        if((m<=6 && d>=1 && d<=20)) {
//            temp2 = 1;
//        }
//        if((temp1 == 1) || (temp2 == 1))
//            System.out.println("True");
//        else
//            System.out.println("False");
//
//    }
//}
