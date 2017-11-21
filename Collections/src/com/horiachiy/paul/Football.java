package com.horiachiy.paul;


public class Football extends Hobby {

    private String name ;
    private String period = "30";
    public Football( String name) {
        this.name = name;
    }

    @Override
    public void intro() {
        System.out.print("\nMy hobby is " + "\'" + name + "\'");
        System.out.println(". And I do sport for " + "\'" + period + "\' days");
    }
    @Override
    public  void greetings() {
        System.out.println("Do you want to play \'" + name + "\' ?");
    }
}
