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
    public void twoNumbersSeparatedByCommas() {
        assertThat(calculator.add("3,3"), is(equalTo(6)));
    }

    @Test
    public void unknownAmountOfNumbersSeparatedByCommas() {
        assertThat(calculator.add("5,15,5,5"), is(equalTo(30)));
    }

    @Test
    public void numbersSeparatedByNewLines() {
        assertThat(calculator.add("7\n11\n20"), is(equalTo(38)));
    }

    @Test
    public void numbersSeparatedByCommasAndNewLines() {
        assertThat(calculator.add("21,16\n10\n8,9"), is(equalTo(64)));
    }
}
