package com.company;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int first,second=50;
        System.out.print("Enter the number:");
        first = num.nextInt();

        if(first >= second){
            System.out.print("Num");
        } else if (first == 45)
            System.out.print("Number is equel 45");
        else{
            System.out.print("Number is lower than "+second);
             }
        }
    }