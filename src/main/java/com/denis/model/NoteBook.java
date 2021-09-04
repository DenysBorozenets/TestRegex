package com.denis.model;


public class NoteBook {
    //private static final String SPACE = " ";
    private static final String DOT = ".";
    private static final String EXCLAMATION_MARK = "!";


    private String firstName;
    private Group group;
    private String fullName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
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
        fullName = firstName
                + EXCLAMATION_MARK;
    }

    public String getFullName() {
        return fullName;
    }
}
