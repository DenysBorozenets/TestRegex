package com.denis.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<NoteBook> noteBooks = new ArrayList<>();

    public void addNoteBook(NoteBook noteBook) {
        noteBooks.add(noteBook);
    }
}
