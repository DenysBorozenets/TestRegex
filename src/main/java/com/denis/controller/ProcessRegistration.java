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

    /**
     *
     * @param noteBook
     * @param view
     * @param scanner
     */
    public ProcessRegistration(NoteBook noteBook, View view, Scanner scanner) {
        this.noteBook = noteBook;
        this.view = view;
        this.scanner = scanner;
    }

    /**
     * main method
     */
    public void process(){
        //enter username data
        noteBook.setFirstName(read(RegexContainer.name, TextConstants.GET_NAME));
        noteBook.setSecondName(read(RegexContainer.name, TextConstants.GET_SECOND_NAME));
        noteBook.setMiddleName(read(RegexContainer.name, TextConstants.GET_MIDDLE_NAME));

        //generate full name
        noteBook.generateFullName();
        view.printMessage(Resource.getString(TextConstants.FULL_NAME));
        view.printText(noteBook.getFullName());

        //enter nick, comment and group
        noteBook.setNickname(read(RegexContainer.nickname, TextConstants.GET_NICKNAME));
        noteBook.setComment(read(RegexContainer.any, TextConstants.GET_COMMENT));
        noteBook.setGroup(groupValidation());

        //enter numbers
        noteBook.setNumberHome(read(RegexContainer.numberHome, TextConstants.GET_HOME_NUMBER));
        noteBook.setNumberMobile(read(RegexContainer.numberMobile, TextConstants.GET_MOBILE_NUMBER));
        noteBook.setSecondNumberMobile(read(RegexContainer.secondNumberMobile, TextConstants.GET_SECOND_MOBILE_NUMBER));

        //email and skype
        noteBook.setMail(read(RegexContainer.email, TextConstants.GET_EMAIL));
        noteBook.setSkype(read(RegexContainer.nickname, TextConstants.GET_SKYPE));

        //full address
        noteBook.setIndex(read(RegexContainer.index, TextConstants.GET_INDEX));
        noteBook.setCity(read(RegexContainer.city, TextConstants.GET_CITY));
        noteBook.setStreet(read(RegexContainer.street, TextConstants.GET_STREET));
        noteBook.setBuilding(read(RegexContainer.building, TextConstants.GET_BUILDING));
        noteBook.setFlat(read(RegexContainer.flat, TextConstants.GET_FLAT));

        //generate full address
        noteBook.generateFullAddress();
        view.printMessage(Resource.getString(TextConstants.GET_FULL_ADDRESS));
        view.printText(noteBook.getFullAddress());
    }

    /**
     *
     * @return group
     */
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
