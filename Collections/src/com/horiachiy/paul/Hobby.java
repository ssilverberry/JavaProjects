package com.horiachiy.paul;

public class Hobby {
    int a = 10;
    double b = Math.random() ;
    Object s = new Object();

    Hobby() {}

    public void intro(){
        System.out.println("Hello!");
    }

    public void greetings() {
        int c = a + (int)b;
        System.out.println("I do sport for >> " + c);
    }

    @Override
    public int hashCode() {
        return a + (int)Math.round(b) + s.hashCode();
    }

    @Override
    public boolean equals(Object o)          {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hobby a1 = (Hobby) o;

        if (s != a1.s) return false;
        return s.equals(a1.b);
    }
}
