package Codewars.LambdaAndStream.ProcessingListOfObjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Task: Processing a list of objects
Create a Person class with Name and Age fields. Create a list of objects of this class and do the following using streams:

Filter for people over 18 years of age.
Sort them by name.
You write down the names of the remaining people on the screen.
 */

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Sasha", 20);
        Person p2 = new Person("Dima", 17);
        Person p3 = new Person("Masha", 19);
        Person p4 = new Person("Nikita", 20);
        Person p5 = new Person("Olya", 17);
        Person p6 = new Person("Oleg", 25);
        Person p7 = new Person("Alex", 27);

        List<Person> Persons = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
        Persons.stream()
                .filter(p -> p.getAge() > 18)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
