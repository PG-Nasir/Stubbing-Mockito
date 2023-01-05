package pg.mockito;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestList {
    //Example of single return values of a List
    @Test
    public void testList_ReturnsSingle_value() {

        List mocklist = mock(List.class);
        when(mocklist.size()).thenReturn(1);

        assertEquals(1, mocklist.size());

        System.out.println( mocklist.size());
        System.out.println(mocklist);
    }

    //Example of multiple return values of a List
    @Test
    public void testList_Returns_MultipleValues() {

        List mocklist = mock(List.class);
        when(mocklist.size()).thenReturn(1).thenReturn(2).thenReturn(3);

        assertEquals(1, mocklist.size());
        assertEquals(2, mocklist.size());
        assertEquals(3, mocklist.size());

        System.out.println(mocklist.size());
        System.out.println(mocklist);

    }
}
