package com.gmail.slobodiyan.task11;

public class Person {

    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setNewProfession(String newProfession) {
        this.profession = newProfession;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Profession: " + profession;
    }

    public static void main(String[] args) {
        Person david = new Person("David", 43, "Driver");
        Person manuel = new Person("Manuel", 35, "Accountant");
        Person mary = new Person("Mary", 37, "Assistant");

        System.out.println("1.\t" + david);
        System.out.println("\t" + manuel);
        System.out.println("\t" + mary);
        System.out.println();

        System.out.println("2.\t" + david);
        System.out.println("\tAfter update");
        david.setNewProfession("Pilot");
        System.out.println("\t" + david);
    }
}
