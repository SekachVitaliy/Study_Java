package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Shape[] arr = new Shape[] {new Triangles(),new Square(),new Circle()};
        for(int i = 0;i < arr.length;i++){
           arr[i].draw();

        }
    }


}