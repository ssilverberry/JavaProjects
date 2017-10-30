package com.company;

/**
 * Created by student on 30.10.17.
 */
public class University {
    int pupils;
    int teachers;
    int dekan;

    Object student;
    Object tchr;
    Object dkn;

    University(int pupils, int teachers, int dekan, Object student, Object tchr, Object dkn) {
        this.pupils = pupils;
        this.teachers = teachers;
        this.dekan = dekan;
        this.dkn = dkn;
        this.tchr = tchr;
        this.student = student;
    }
    University() {}

    public void tell() {
        System.out.println("We have " + pupils + " pupils. " + teachers + " teachers. " + dekan + " dekan.");
    }
}
