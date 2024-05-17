import jason.Person;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LambdasAndStreams {
    //functional interface
    //comparable interface
    //comparator interface
    public static void main(String[] args) {
        Comparator<Person> comparator = (previousPerson, nextPerson)->{
            return nextPerson.getName().compareTo(previousPerson.getName());
        };
        Set<Person> people = new TreeSet<>(comparator);

    }

}
