package jason;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction = (word, number) -> word.length() == number;
        Boolean result = biFunction.apply("chichi", 6);
        System.out.println(result);
    }
}
