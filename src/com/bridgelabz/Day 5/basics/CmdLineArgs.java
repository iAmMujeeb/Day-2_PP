package com.bridgelabz.basics;

public class CmdLineArgs {

    public static void main(String[] args) {
        System.out.println(args[0]);
        int x = Integer.parseInt(args[0]);
        System.out.println(x);
        System.out.println(args[1]);

    }
}
