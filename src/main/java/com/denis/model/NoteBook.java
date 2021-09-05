package com.denis.model;


public class NoteBook {
    private static final String SPACE = " ";
    private static final String DOT = ".";
    private static final String EXCLAMATION_MARK = "!";


    private String firstName;
    private String secondName;
    private String middleName;
    private String fullName;

    private String nickname;
    private String comment;
    private Group group;

    private String numberHome;
    private String numberMobile;
    private String secondNumberMobile;


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

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
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

    public void setNumberHome(String numberHome) {
        this.numberHome = numberHome;
    }

    public String getNumberHome() {
        return numberHome;
    }

    public void setNumberMobile(String numberMobile) {
        this.numberMobile = numberMobile;
    }

    public String getNumberMobile() {
        return numberMobile;
    }

    public void setSecondNumberMobile(String secondNumberMobile) {
        this.secondNumberMobile = secondNumberMobile;
    }

    public String getSecondNumberMobile() {
        return secondNumberMobile;
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
