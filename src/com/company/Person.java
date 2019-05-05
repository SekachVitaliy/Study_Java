package com.company;


 public class Person {
   public int height = 180;
   public String name;

   public void say(String name){
       System.out.println("Hello "+ name +":)");
   }

   public Person (int h,String j){
       name = j;
       height = h;
   }

     public Person (String j) {
         name = j;
     }




     }
