package com.denis.controller;

import com.denis.model.Model;
import com.denis.model.NoteBook;
import com.denis.view.View;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;
    private final Scanner scanner = new Scanner(System.in);

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        NoteBook noteBook = new NoteBook();
        registerNoteBook(noteBook);

    }

    public void registerNoteBook(NoteBook noteBook) {
        ProcessRegistration processRegistration = new ProcessRegistration(noteBook, view, scanner);
        processRegistration.process();
        model.addNoteBook(noteBook);
    }
}
