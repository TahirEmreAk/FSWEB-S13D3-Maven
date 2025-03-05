package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private String gender;
    private String nationality;
    private String occupation;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String gender, String nationality, String occupation){
        this(firstName, lastName, age);
        this.gender = gender;
        this.nationality = nationality;
        this.occupation = occupation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
