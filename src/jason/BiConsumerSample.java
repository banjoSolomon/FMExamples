package jason;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (firstname, age) ->
        printFullName(firstname,age);
        biConsumer.accept("Jason", 25);

    }
    private static void printFullName(String firstname, int age){
        System.out.println(firstname + " " + age);

        Map<String,Integer> map = Map.of(
                "John", 10,
                "sam", 15,
                "Jason", 25
        );
        //map.forEach();
    }
}
