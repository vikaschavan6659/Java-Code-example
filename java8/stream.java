package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class stream {

    public static void main(String[] args) {
        List<Integer>  number = Arrays.asList(1,5,8,9,6,3,4,7);
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(1);arrayList.add(2);arrayList.add(12);arrayList.add(5);arrayList.add(6);arrayList.add(8);
        Optional<Integer> integer=arrayList.stream().distinct().sorted((a,b)-> b-a).skip(1).findFirst();

        System.out.println(integer.get());

        List<Integer> integerList = Arrays.asList(15,20,36,4,5,8,9);
        System.out.println(integerList.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst().get());

        System.out.println(integerList.stream().distinct().sorted((a,b)-> b-a)
                .map(i -> i * 2).toList());

        String input ="vikass";

        Map<Character, Long> charCount = input.chars()  // Convert the string to an IntStream
                .mapToObj(c -> (char) c)               // Convert each int to a Character object
                .collect(Collectors.groupingBy(        // Group by each character
                        Function.identity(),           // Use the character itself as the key
                        Collectors.counting()          // Count the occurrences of each character
                ));
        charCount.forEach((character, count) ->
                System.out.println(character + ": " + count));
    }
}
