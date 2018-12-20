package tdd.kata;

public class StringCalculator {
    public int add(String numbersAsText) {
        if (numbersAsText.isEmpty()) {
            return 0;
        }
        return Integer.valueOf(numbersAsText);
    }
}
