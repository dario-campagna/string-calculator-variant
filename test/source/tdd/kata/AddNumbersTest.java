package tdd.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AddNumbersTest {

    @Test
    public void emptyString() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.add(""), is(equalTo(0)));
    }

    @Test
    public void oneNumber() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.add("1"), is(equalTo(1)));
    }

    @Test
    public void anotherNumber() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.add("2"), is(equalTo(2)));
    }
}
