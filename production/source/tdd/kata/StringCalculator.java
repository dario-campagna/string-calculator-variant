package tdd.kata;

public class StringCalculator {
    public int add(String numbersAsText) {
        if (numbersAsText.isEmpty()) {
            return 0;
        } else if (numbersAsText.contains(",")) {
            String[] numbers = numbersAsText.split(",");
            return Integer.valueOf(numbers[0]) + Integer.valueOf(numbers[1]);
        }
        return Integer.valueOf(numbersAsText);
    }
}
