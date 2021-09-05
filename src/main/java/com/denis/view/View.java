package com.denis.view;

public class View {
    public void printMessage(String message, Object... args) {
        System.out.printf(message, args);
    }

    public void printText(String message) {
        System.out.println(message);
    }
}
