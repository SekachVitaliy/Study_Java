package com.company;


public class Main {

    public static void main(String[] args){
        for(int i =1;i<=10;i*=5){
            System.out.println(i);
        }
        boolean j=true;
        int k=0;
        while(j){
            System.out.println(k);
            k+=2;
            if (k>20)
                j=false;
        }
        int z=0;
        do{
          z++;
          System.out.println("Hello");
        } while(z<1);



        }
    }