package com.company;

/**
 * Created by student on 30.10.17.
 */
public class Teacher extends Human {
    static String position;
    static String name;
    static String depend;

    Teacher(String position, String name, String depend) {
        this.position = position;
        this.name = name;
        this.depend = depend;
    }
    Teacher() {}
    public static void tell() {
        System.out.println("I am a " + position + "My name is " + name);
        System.out.print("I depend from " + depend + " ");
    }

    @Override
    public void teach() {
        super.teach();
        System.out.print("I teach \n");
    }
}
