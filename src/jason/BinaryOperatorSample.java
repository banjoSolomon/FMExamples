package jason;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (number, num) -> number * num;
       System.out.println(binaryOperator.apply(5,10));
    }
}
