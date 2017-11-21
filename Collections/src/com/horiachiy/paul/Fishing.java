package com.horiachiy.paul;

public class Fishing extends Hobby {
    private String name;

    public Fishing ( String name) {
        this.name = name;
    }

    @Override
    public void intro() {
        System.out.print("\nMy hobby is  just \'" + name + "\'");
        System.out.print(". And I don't like to do sport \n");
    }
    @Override
    public void greetings() {
        int a = 10;
        String b = "I do \'" + this.name + "\' for " + a + " days";
        System.out.println(b);
    }
}
