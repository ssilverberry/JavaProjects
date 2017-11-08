package com.horiachiy.paul;

import java.util.concurrent.ExecutionException;

public class Basketball extends Hobby {
    private String name;
    private String period = "100";
    private int count = 5;
    
    public Basketball( String name) {
        this.name = name;
    }
    @Override
    public void intro() {
        System.out.print("\nMy hobby is " + "\'" + name + "\'");
        System.out.println(". And I do sport for " + "\'" + period + "\' days");
    }
    @Override
    public  void greetings(int a) throws HobbyException{
        System.out.print("Hi!");
        System.out.println(" Easy breezy, let's play \'"+ name + "\'");
        if(true)
            count = count / a;
        if(a <= 0)
            throw new HobbyException("Error", new ArithmeticException());
    }

}
