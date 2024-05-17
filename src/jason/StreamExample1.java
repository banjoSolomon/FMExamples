package jason;

import java.util.stream.IntStream;

public class StreamExample1 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).filter((number) -> number%2==0).forEach(System.out::println);
    }
}
