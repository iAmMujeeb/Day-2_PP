package com.bridgelabz.basics;

public class Arrays1 {

    // Array is used to store multiple data of a single data type
    public static void main(String[] args) {
        int[] arr1 = new int[6];
        arr1[0] = 23;
        arr1[4] = 54;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();
        float[] arr2 = new float[4];
        arr2[0] = 4.5F;
        arr2[3] = 3.2F;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println();
        int[] arr3 = {3, 6, 7, 8, 23, 62, 12, 24};

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println();
        int[][] arr4 = new int[3][4];

        arr4[0][1] = 35;
        arr4[2][2] = 23;
        arr4[1][2] = 12;
        arr4[1][0] = 56;

        for (int i = 0; i < arr4.length; i++) {

            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + "   ");
            }

            System.out.println();
        }

        System.out.println();
        int[][] arr5 = {{2, 4, 5, 9, 8}, {1, 4, 9, 23, 3}, {8, 45, 23, 11, 6}, {1, 5, 7, 23, 98}};
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j] + " ");
            }
        }

    }
}
