package PredIcate.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {

        Consumer< String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("vikas");

        Consumer<List<Integer>> listConsumer = li -> {
            for (Integer i :li){
                System.out.println(i*100);
            }
        };

        listConsumer.accept(Arrays.asList(1,2,3,4,5,6,7));


        System.out.println("===============================");

        Consumer <List<Integer>> listConsumer1 = li -> {
            for (Integer i :li){
                System.out.println(i*100);
            }
        };

        Consumer <List<Integer>> listConsumer2 = li -> {
            for (Integer i :li){
                System.out.println(i);
            }
        };

        listConsumer1.andThen(listConsumer2).accept(Arrays.asList(1,2,3,4,5,6));
    }
}
