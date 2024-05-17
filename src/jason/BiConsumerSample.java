package jason;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (firstname, age) ->System.out.println( firstname+"you are "+age+ "years old");
        biConsumer.accept("Jason", 25);

    }
    private static void printFullName(String firstname, String surname){
        System.out.println(firstname + " " + surname);
    }
}
