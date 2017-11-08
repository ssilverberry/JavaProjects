package com.horiachiy.paul;

public class HobbyException extends Exception {
    private static Throwable error;
    HobbyException(String message, Throwable cause) {
        super(message);
        error = cause;
    }
    public static Throwable getError() {
        return error;
    }
}
