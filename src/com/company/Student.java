package com.company;

public class Student extends Person {
    int course=1;

    void tell () {
        System.out.println(super.height);
        System.out.println(super.name);
        System.out.println(course);
    }
    public Student(int n,String j,int course){
        super(n,j);
        this.course=course;

    }

}
