package jason;

import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(20, 30, 40, 50);
        Stream<Integer> stream = numbers.stream();
        stream.forEach(System.out::println);

        Stream<String> emptyStream = Stream.empty();
        Stream<Transaction> transactionStream = Stream.of(new Transaction("$100", "12345"), new Transaction("$3000", "123457"));
        transactionStream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.generate(()->new SecureRandom().nextInt());
        integerStream.limit(10).forEach(System.out::println);

    }
}
