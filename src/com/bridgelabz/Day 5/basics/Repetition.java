package com.bridgelabz.basics;

public class Repetition {

    // i++(post-increment),++i(pre-increment)
    // i--,--i
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x); // 10
//        int res = x++;
        int res = ++x;
        System.out.println(res); // 10   // 11
        System.out.println(x); // 11     // 11

        int z = 23;
        int res2 = z++ + ++z + z++ + z++ + ++z + ++z + z++ + z;
        //23 + 25 + 25 + 26 + 28 + 29 + 29 + 30 = 215
        System.out.println(z);     // 3  //     // 30 // 29 //   30
        System.out.println(res2); // 193 // 184 // 205 // 211    215

        int m = 45;
        int res3 = m-- - m-- - m++ - ++m + m-- + m--;
        // 45 - 44 - 43 - 45 + 45 + 44 = 2
        System.out.println(m);     // 43  // 42 // 43 // 45 // 44 // 44 // 43 //  43
        System.out.println(res3); // -129 // 2  // 2  // 2  // 2  // -2 // 2  //  2

        System.out.println();

        for (int i = 0; i < 10; i++) {
            int y = 10;
            System.out.println(y);
            System.out.println(i);
        }
//        System.out.println(y);
//        System.out.println(i);

        System.out.println();
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        System.out.println();
//        int k = 0;
        int k = 10;
        do {
            System.out.println(k);
            ++k; // 1
        } while (k < 10);


    }
}
