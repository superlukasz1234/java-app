package pl.dev.project.service;

import pl.dev.project.model.Person;

import java.util.ArrayList;
import java.util.List;

public class TestTask {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "a", "A", 30));
        personList.add(new Person(2, "b", "B", 20));
        personList.add(new Person(3, "b", "C", 30));
        personList.add(new Person(4, "c", "D", 40));
        personList.add(new Person(5, "d", "E", 50));
        personList.add(new Person(6, "e", "F", 60));
        removePersonByAge(personList, 30).forEach(System.out::println);


    }

    public static List<Person> findPersonByAge(List<Person> list, int age) {
        List<Person> result = new ArrayList<>();
        for (Person p : list) {
            if (p.getAge() > age) {
                result.add(p);
            }
        }
        return result;
    }

    public static List<Person> removePersonByAge(List<Person> list, int age) {
        List<Person> result = new ArrayList<>(list);
        for (Person p : list) {
            if (p.getAge() <= age) {
                result.remove(p);
            }

        }
        return result;

    }

}
