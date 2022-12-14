package classes;

import enums.Country;
import enums.Gender;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private String lastName;
    private LocalDate year;
    private Gender gender;
    private Country country;
    private String phoneNumber;
    private int age;

    public Person(int id, String name, String lastName, LocalDate year, Gender gender, Country country, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.gender = gender;
        this.country = country;
        this.phoneNumber = phoneNumber;

    }

    public Person() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", gender=" + gender +
                ", country=" + country +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
