package com.company;

/**
 * Created by student on 30.10.17.
 */
public class Dekan extends Human{
    String position;
    String name;
    String depend;

    Dekan(String position, String name, String depend) {
        this.position = position;
        this.name = name;
        this.depend = depend;
    }
    Dekan() {}
    public void tell() {
        System.out.println("My name is " + name + " " + depend +" depend from me " +
                           ". My position is " + position);
    }

    @Override
    public void teach() {
        super.teach();
        System.out.print("I teach \n");
    }
}
