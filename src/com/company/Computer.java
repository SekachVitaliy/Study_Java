package com.company;

public class Computer {
    class Processor{
        private boolean isStart =false;
        public void start (){
            isStart= true;
            System.out.println("Is started");
        }
        public   void shutdown(){
            isStart=false;
            System.out.println("Is OFF");
        }
    }
    class RAM {
        private boolean isStart =false;
        public void start (){
            isStart= true;
            System.out.println("Is started");
        }
        public   void shutdown(){
            isStart=false;
            System.out.println("Is OFF");
        }
    }
    Processor I7 = new Processor();
    RAM Transend = new RAM();
}
