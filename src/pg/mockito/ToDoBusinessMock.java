package pg.mockito;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ToDoBusinessMock {
    @Test
    public void testusing_Mocks() {

        /* Create mock object */
        ToDoService doService = mock(ToDoService.class);
        /* when method used when execute a call method then return specify value. Here we use
        * doService.getTodos("dummy"). after execute this method we return our dummy values.
        * We put it business and business depend service.  */
        List<String> combinedlist = Arrays.asList(" Use Core Java ", " Use Spring Core ","Hibernate jpa", " Use w3eHibernate ", " Use Spring MVC ");
        when(doService.getTodos("dummy")).thenReturn(combinedlist);

        ToDoBusiness business = new ToDoBusiness(doService);

        List<String> alltd = business.getTodosforHibernate("dummy");

        System.out.println(alltd);
        assertEquals(2, alltd.size());
    }
}
