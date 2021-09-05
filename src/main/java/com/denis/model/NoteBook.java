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

    private String mail;
    private String skype;

    private String index;
    private String city;
    private String street;
    private String building;
    private String flat;
    private String fullAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setGroup(String group) {
        setGroup(Group.valueOf(group));
    }

    public String getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(String numberHome) {
        this.numberHome = numberHome;
    }

    public String getNumberMobile() {
        return numberMobile;
    }

    public void setNumberMobile(String numberMobile) {
        this.numberMobile = numberMobile;
    }

    public String getSecondNumberMobile() {
        return secondNumberMobile;
    }

    public void setSecondNumberMobile(String secondNumberMobile) {
        this.secondNumberMobile = secondNumberMobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public void generateFullName() {
        fullName = secondName
                + SPACE
                + firstName.charAt(0)
                + DOT;
    }

    public void generateFullAddress() {
        fullAddress = index
                + SPACE
                + city
                + SPACE
                + street
                + SPACE
                + building
                + SPACE
                + flat
                + EXCLAMATION_MARK;
    }
}
