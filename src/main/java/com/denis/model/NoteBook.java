package com.denis.model;


public class NoteBook {
    private static final String SPACE = " ";
    private static final String DOT = ".";
    private static final String EXCLAMATION_MARK = "!";


    private String firstName;
    private String secondName;
    private String middleName;

    private Group group;
    private String fullName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setGroup(String group) {
        setGroup(Group.valueOf(group));
    }

    public Group getGroup() {
        return group;
    }

    public void generateFullName() {
        fullName = secondName
                + SPACE
                + firstName.charAt(0)
                + DOT;
    }

    public String getFullName() {
        return fullName;
    }
}
