package tdd.kata;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {
    public int add(String numbersAsText) {
        return tokenize(numbersAsText).mapToInt(Integer::valueOf).sum();
    }

    private Stream<String> tokenize(String numbersAsText) {
        if (numbersAsText.isEmpty()) {
            return Stream.empty();
        }
        return Arrays.stream(numbersAsText.split(",|\n"));
    }
}