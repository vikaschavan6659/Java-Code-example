package PredIcate;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Bipredicate {
    public static void main(String[] args) {
        BiPredicate<String ,Integer> bipredicate = (string , x) -> string.length() == x;
        System.out.println(bipredicate.test("vikas",5));

        BiFunction<String ,String ,String> biFunction = (x ,y) -> x.toLowerCase() + " " +y.toLowerCase();

        System.out.println(biFunction.apply("vikas","chavan"));

        
    }
}
