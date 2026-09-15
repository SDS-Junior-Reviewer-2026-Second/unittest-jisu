import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenTest {

    static OddEven oddEven;

    @BeforeAll
    static void setupOddEven(){
        oddEven = new OddEven();
    }

    @Test
    void getResultNormalCase() {

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<String> result = oddEven.getResult(input);
        List<String> expected = Arrays.asList("X", "O", "X", "O", "X", "O");
        assertEquals(expected, result);

        input = Arrays.asList(5, 1, 1, 1, 4);
        result = oddEven.getResult(input);
        expected = Arrays.asList("X", "X", "X", "X", "O");
        assertEquals(expected, result);
    }

    @Test
    void getResultEmptyCase() {
        List<String> result = oddEven.getResult(new ArrayList<>());
        assertNull(result);
    }

    @Test
    void getResultAllSameCase() {
        List<String> result = oddEven.getResult(Arrays.asList(1, 1, 1, 1));
        assertNull(result);

        result = oddEven.getResult(Arrays.asList(2, 6, 4, 8));
        assertNull(result);
    }
}