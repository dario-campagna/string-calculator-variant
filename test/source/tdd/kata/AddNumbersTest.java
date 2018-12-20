package tdd.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AddNumbersTest {

    private StringCalculator calculator;

    @Before
    public void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    public void emptyString() {
        assertThat(calculator.add(""), is(equalTo(0)));
    }

    @Test
    public void oneNumber() {
        assertThat(calculator.add("1"), is(equalTo(1)));
    }

    @Test
    public void anotherNumber() {
        assertThat(calculator.add("2"), is(equalTo(2)));
    }

    @Test
    public void twoNumbersSeparatedByComma() {
        assertThat(calculator.add("3,3"), is(equalTo(6)));
    }

    @Test
    public void unknownAmountOfNumbersSeparatedByComma() {
        assertThat(calculator.add("5,15,5,5"), is(equalTo(30)));
    }
}
