package com.gmail.slobodiyan.task12;

public class Colleague {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private byte age;

    public Colleague(String name, String position, String email, String phoneNumber, byte age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Colleague colleague = new Colleague("Нуб Кирило Петрович",
                "Адвокат",
                "NYB@gmail.com",
                "+38 (067) 091 34 91",
                (byte) 51);
    }
}
