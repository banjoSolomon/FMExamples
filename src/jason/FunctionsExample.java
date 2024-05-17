package jason;

import java.util.function.Function;

public class FunctionsExample {
    public static void main(String[] args) {
        Function<String,Integer> function = (word)->word.length();
        System.out.println(function.apply("Solomon"));
    }
}
