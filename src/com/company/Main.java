package com.company;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args){
           Scanner num = new Scanner(System.in);
           int first,second,result;
           System.out.print("First number:");
           first = num.nextInt();
           System.out.print("Second number:");
           second = num.nextInt();
           result=first + second;
           result --;
           System.out.println(first+"+"+second+"="+result);

    }
}
