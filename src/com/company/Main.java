package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        write_array();

    }
    public static int[] write_array() {
        int n;
        int array[];
        System.out.print("Enter bit depth : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number ["+ (i+1) +"]-");
            array[i] = in.nextInt();
        }
        return array;


    }
}