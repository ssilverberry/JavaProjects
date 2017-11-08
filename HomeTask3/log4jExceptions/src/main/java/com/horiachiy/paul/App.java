package com.horiachiy.paul;

import javafx.application.Application;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
    final static Logger logger = Logger.getLogger("App.class");

    public static void main( String[] args ) throws HobbyException {
        Hobby[] arr = { new Football("football"),
                new Basketball("basketball"),
                new Fishing("fishing")};
        for (Hobby i: arr) {
            i.intro();
        }
        handleExcp();
    }

    static void handleExcp() throws HobbyException {
        Hobby[] inst = { new Football("football"),
                         new Basketball("basketball")};
        try{
            inst[0].greetings(-2);
            inst[1].greetings(0);
        } catch (HobbyException e) {
            System.out.println();
            logger.warning("You've entered a not allowed number !!! \n");
            logger.severe("This is a issue >> "+ HobbyException.getError() + "\n");
            e.printStackTrace();
        }
    }
}
