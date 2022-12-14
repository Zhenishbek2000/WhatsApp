package impl;

import classes.Person;

import java.time.LocalDate;
import java.util.List;
public interface PersonService {
String createPerson(List<Person>people,int id,String name,String lastName,LocalDate year,String gender,String country, String phoneNumber);
List<Person>gerAllPerson(List<Person>people);
}
