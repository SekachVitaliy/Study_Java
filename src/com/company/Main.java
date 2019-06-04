package com.company;

public class Main {
    public static void main(String[] args) {
        array a =new MyArray();
        System.out.println(a.Add(45));
        System.out.println(a.Add(4));
        System.out.println(a.Add(5));
        System.out.println(a.Add(13));
        System.out.println(a.Add(42));
        System.out.println(a.Get(3));
        array b = new SecondArray();
        System.out.println(b.Add(5));
        System.out.println(b.Add(13));
        System.out.println(b.Add(42));
        System.out.println(b.Get(1));

    }
}