package jason;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorSample {
    public static void main(String[] args) {
        LongUnaryOperator unaryOperator = (number) -> 2 * number;
        Long result = unaryOperator.applyAsLong(30L);
        System.out.println(result);

    }
}
