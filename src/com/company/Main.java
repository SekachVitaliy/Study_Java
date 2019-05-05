package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Person Sasha = new Person(145,"Sasha");
        Person Vlad  = new Person(175,"Vlad");
        Vlad.say("Sasha");
        Sasha.say("Vald");
        Vlad.height =145 ;
        System.out.print(Sasha.name+"'s height "+ Sasha.height+"sm");

    }


}