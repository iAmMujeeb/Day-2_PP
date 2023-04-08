package com.bridgelabz.basics;

public class FrequencyArray {

    public static void main(String[] args) {

        int[] arr = {5,10, 20, 20, 40, 10, 40};
        int[] visitedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visitedArray[i] != -1) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visitedArray[j] = -1;
                    }
                }
                System.out.println(arr[i] + " -> " + count);
            }
        }
    }
}
