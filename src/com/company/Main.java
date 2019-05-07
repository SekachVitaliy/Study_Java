package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Person Sasha = new Person(145,"Sasha");
        Person Vlad  = new Person(175,"Vlad");
        Vlad.say("Sasha");
        Sasha.say("Vald");
        Vlad.height =145 ;
        System.out.println(Sasha.name+"'s height "+ Sasha.height+"sm");
        System.out.println();
        Student Freshman = new Student(175,"Viktor",4);
        Freshman.tell();
        Student  Fresh  =new Student(195,"Vlad",5);
        Fresh.tell();

    }


}