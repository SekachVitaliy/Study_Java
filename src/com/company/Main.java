package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Person Sasha = new Person();
        Person Vlad  = new Person();
        Vlad.say("Sasha");
        Sasha.say("Vald");
        Vlad.height =145 ;
        System.out.print("Vlad "+Vlad.height+"sm and Shasha "+ Sasha.height+"sm");

    }


}