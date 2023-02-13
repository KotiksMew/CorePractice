package com.company;
//Создать класс - элемент записной книжка (поля: Имя, Ник, мобильный
        //телефон, адрес электронной почты, номер ICQ).
public class Note {
    private String name;
    private String nickName;
    private String phoneNumber;
    private String email;
    private String numberICQ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberICQ() {
        return numberICQ;
    }

    public void setNumberICQ(String numberICQ) {
        this.numberICQ = numberICQ;
    }
}
