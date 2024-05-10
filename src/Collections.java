import jason.Person;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
//        boolean b = true;
//        Collection<Boolean> booleans = new ArrayList<>();
//        booleans.add(b);

        Collection<String> words = new TreeSet<>();
        words.add("hello");
        System.out.println(words);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        Set<List<Integer>> set = new HashSet<>();
        set.add(numbers);
        System.out.println(set);

    }

}
