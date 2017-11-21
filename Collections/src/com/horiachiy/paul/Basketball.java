package com.horiachiy.paul;


public class Basketball extends Hobby {
    private String name ;

    public Basketball( String name) {
        this.name = name;
    }
    @Override
    public void intro() {
        String period = "100";
        System.out.print("\nMy hobby is " + "\'" + this.name + "\'");
        System.out.println(". And I do sport for " + "\'" + period + "\' days");
    }
    @Override
    public  void greetings() {
        System.out.print("Hi!");
        System.out.println(" Easy breezy, let's play \'"+ this.name + "\'");
    }
}
