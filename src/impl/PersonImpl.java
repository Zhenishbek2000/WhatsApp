package impl;

import classes.Person;
import enums.Country;
import enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonImpl implements PersonService{
    private List<Person>personList=new ArrayList<>();

    @Override
    public String createPerson(List<Person> people, int id, String name, String lastName, LocalDate year, String gender, String country, String phoneNumber) {
        people.add(new Person(id,name,lastName,year,Gender.valueOf(gender.toUpperCase()), Country.valueOf(country.toUpperCase()), phoneNumber));

        return "Uspeshno poluchili passport";
    }
    @Override
    public List<Person> gerAllPerson(List<Person> people) {
        return people;
    }
}
