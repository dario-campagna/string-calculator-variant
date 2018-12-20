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
}
