package PredIcate;

import java.util.Arrays;
import java.util.List;

public class StartWith {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 10, 11, 12, 20, 21, 22, 29, 30);

        for (int number : numbers) {
            // Convert number to string to check the starting digit
            String numStr = String.valueOf(number);
            if (!(number == 1 || number == 2 || numStr.startsWith("1") || numStr.startsWith("2"))) {
                System.out.println(number);
            }
        }
    }
}
