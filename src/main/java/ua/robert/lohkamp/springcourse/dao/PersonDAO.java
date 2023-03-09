package ua.robert.lohkamp.springcourse.dao;

import org.springframework.stereotype.Component;
import ua.robert.lohkamp.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> personList;

    {
        personList = new ArrayList<>();

        personList.add(new Person(++PEOPLE_COUNT, "Andrew"));
        personList.add(new Person(++PEOPLE_COUNT, "Tom"));
        personList.add(new Person(++PEOPLE_COUNT, "Bob"));
        personList.add(new Person(++PEOPLE_COUNT, "Alice"));
    }

    public List<Person> index() {
        return personList;
    }

    public Person show(int id) {
        return personList.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        personList.add(person);
    }
}
