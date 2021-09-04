package com.denis.controller;

import com.denis.model.Group;
import com.denis.model.NoteBook;
import com.denis.view.TextConstants;
import com.denis.view.View;

import java.util.Scanner;

public class ProcessRegistration {
    private final NoteBook noteBook;
    public final View view;
    private final Scanner scanner;

    public ProcessRegistration(NoteBook noteBook, View view, Scanner scanner) {
        this.noteBook = noteBook;
        this.view = view;
        this.scanner = scanner;
    }

    public void process(){
        noteBook.setFirstName(read(RegexContainer.name, TextConstants.GET_NAME));
        noteBook.generateFullName();
        noteBook.setGroup(groupValidation());
        view.printMessage(Resource.getString(TextConstants.FULL_NAME));
        System.out.println();
        view.printText(noteBook.getFullName());
    }

    private String groupValidation(){
        String group;
        group = read(RegexContainer.any, TextConstants.GET_Group);
        while (!Group.contain(group)){
            view.printMessage(Resource.getString(TextConstants.WRONG_INPUT_DATA));
            group = read(RegexContainer.any, TextConstants.GET_Group);
        }
        return group;
    }

    private String read(String pattern, String message) {
        pattern = Resource.getString(pattern);
        message = Resource.getString(message);
        view.printMessage(message);
        message = Resource.getString(TextConstants.WRONG_INPUT_DATA) + message;

        while (!scanner.hasNext(pattern)) {
            view.printText(message);
            scanner.next();
        }
        return scanner.next();
    }

}
