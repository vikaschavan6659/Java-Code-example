package PredIcate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> integerPredicate = x -> x % 2 ==0;
        System.out.println(integerPredicate.test(12));

        Predicate <String>  startWithLetter = x -> x.toLowerCase().charAt(0)=='v';
        Predicate <String>  endWithLetter = x -> x.toLowerCase().charAt(x.length() -1)=='s';


        System.out.println(startWithLetter.test("vikas"));
        System.out.println(endWithLetter.test("vikas"));
    }
}
