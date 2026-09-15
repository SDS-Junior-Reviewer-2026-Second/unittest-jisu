import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class SampleTest {

    @Mock
    ArrayList<Integer> al;

    @Test
    void testMockito(){

        doReturn(10000).when(al).size();

        al.add(9999);
        System.out.println(al.size());
        assertEquals(10000, al.size());
    }
}
