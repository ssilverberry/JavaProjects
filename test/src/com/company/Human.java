package com.company;

/**
 * Created by student on 30.10.17.
 */
public class Human implements Scientiest{
    String firstName;
    String secondName;

    Human(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    Human() {}
    public void tellAbout() {
        System.out.println("My name is " + firstName + " " + secondName);
    }

    @Override
    public void teach() {
        System.out.println("");
    }

    @Override
    public void study() {
        System.out.println("");
    }
}
