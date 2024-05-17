import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = (words) ->{
            System.out.println("you have entered "+words);
            System.out.println("i am printing "+words);
            System.out.println(words);;

        };
       // consumer.accept("hello world");
        List<String> names = List.of("Solomon, Joe, John");
        names.forEach(consumer);
        consumer.andThen((a)-> System.out.println("running and then for" + a));
        consumer.accept("Jane");
    }
}
