import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        int res = calculator.add(1, 5);
        assertEquals(6, res);
    }

    @Disabled
    @Test
    void subtract() {
        int res = calculator.subtract(1, 5);
        assertEquals(-4, res);
    }

    @Test
    void multiply() {
        int res = calculator.multiply(20, -5);
        assertEquals(-100, res);
    }

    @Disabled
    @Test
    void divide() {
        int res = calculator.divide(14, 5);
        assertEquals(2, res);
        assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0));
    }

    @Test
    void testAssertJ(){
        String abc = "1234567";
        assertThat(abc)
                .isEqualTo("1234567")
                .startsWith("123")
                .contains("56");
    }
}