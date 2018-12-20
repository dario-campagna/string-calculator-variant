package tdd.kata;

import java.util.Arrays;

public class StringCalculator {
    public int add(String numbersAsText) {
        if (numbersAsText.isEmpty()) {
            return 0;
        } else if (numbersAsText.contains(",")) {
            String[] numbers = numbersAsText.split(",");
            return Arrays.stream(numbers).mapToInt(Integer::valueOf).sum();
        }
        return Integer.valueOf(numbersAsText);
    }
}
