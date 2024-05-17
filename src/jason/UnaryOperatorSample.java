package jason;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (melody) -> melody + " Micheal";
        String result = unaryOperator.apply("Melody");
        System.out.println(result);
    }
}
