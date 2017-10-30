package com.company;

/**
 * Created by student on 30.10.17.
 */
public class Student extends Human{
    static String position;
    static String name;
    static String depend;

    Student(String position, String name, String depend) {
        this.position = position;
        this.name = name;
        this.depend = depend;
    }
    Student() {}
    public static void tell() {
        System.out.println("My name is " + name + " I'm a " + position);
        System.out.print("I depend from " + depend + " ");
    }

    @Override
    public void study() {
        super.study();
        System.out.print("I study \n");
    }
}
