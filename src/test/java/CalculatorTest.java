import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculatorTest {

    @Mock
    Adder adder;

    Calculator calculator;

    @BeforeEach
    void setup(){

        when(adder.add(Mockito.anyInt(), Mockito.anyInt()))
                .thenAnswer(invocation -> {
                    int a = invocation.getArgument(0);
                    int b = invocation.getArgument(1);
                    return a + b;
                });

        calculator = new Calculator(adder);

    }

    @Test
    void add() {
        int res = calculator.add(1, 5);
        assertEquals(6, res);
    }

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

    @Disabled
    @Test
    void testAssertJ(){
        String abc = "1234567";
        assertThat(abc)
                .isEqualTo("1234567")
                .startsWith("123")
                .contains("56");
    }
}