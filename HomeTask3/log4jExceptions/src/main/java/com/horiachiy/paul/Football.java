package com.horiachiy.paul;

public class Football extends Hobby {
    private String period = "30";
    private String name;
    private int count = 5;
    public Football( String name) {
        this.name = name;
    }
    @Override
    public void intro() {
        System.out.print("\nMy hobby is " + "\'" + name + "\'");
        System.out.println(". And I do sport for " + "\'" + period + "\' days");
    }
    @Override
    public void greetings(int some) throws HobbyException {
        System.out.println("Do you want to play \'" + name + "\' ?");
        if(true)
            count = count / some;
        if(some <= 0)
            throw new HobbyException("Don't divide on zero!!!", new ArithmeticException());
    }
}