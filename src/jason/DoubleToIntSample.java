package jason;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntSample {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (decimalNumber) -> Double.valueOf(decimalNumber).intValue();
       int result = doubleToIntFunction.applyAsInt(20.88);
        System.out.println(result);
    }
}
