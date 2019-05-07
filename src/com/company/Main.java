package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Computer comp = new Computer();
        comp.I7.start();
        comp.Transend.start();
        comp.Transend.shutdown();
        comp.I7.shutdown();

        new Computer(){
            void supercomp() {
                this.I7.shutdown();
                this.I7.shutdown();
            }

        };

    }


}