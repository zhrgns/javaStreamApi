package org.example.oldestPerson;

import java.util.Comparator;
import java.util.List;

public class OldestPerson {

    public static void main(String[] args) {

    }

    public static Person getOldestPerson(List<Person> people){
        Person oldestPerson = new Person("",0);

        for (Person person : people) {
            if( person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }

        return  oldestPerson;
    }

    public static Person getOldestPersonWitStreamApi(List<Person> people){
        return people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);

    }

}
