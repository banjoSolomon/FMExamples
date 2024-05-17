package jason;

import java.util.function.BiPredicate;

public class BIPredicate {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (wife, husband )  -> wife.length()== husband.length();
        System.out.println(biPredicate.test("solomon", "ben"));
    }
}
