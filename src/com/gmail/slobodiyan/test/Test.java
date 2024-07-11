package com.gmail.slobodiyan.test;

public class Test {

    private Long id;
    private String fullName;
    private int age;

    public Test() {
    }

    public void printInfo(String fullName, long age) {
        System.out.printf("Fullname: %s, age: %d", fullName, age);
    }

    public void printInfo(String fullName, int age) {
        System.out.printf("Fullname: %s, age: %d", fullName, age);
    }

    public static void main(String[] args) {
        Test person = new Test();
        person.printInfo("Viktor", 54);
    }
}
