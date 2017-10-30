package com.company;

public class Main{

    public static void main(String[] args) {

        Student arr[] = new Student[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Student("student", "A" + i, "teacher");
            arr[i].tell();
            arr[i].study();
        }
        Teacher tr[] = new Teacher[2];
        for(int i = 0; i < tr.length; i++ ){
            tr[i] = new Teacher("teacher ", "B" + i, " Dekan");
            tr[i].tell();
            tr[i].teach();
        }
        Dekan dk = new Dekan("dekan", "BigBoss", "teachers");
        dk.tell();
        dk.teach();

    }
}
