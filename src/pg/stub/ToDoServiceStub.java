package pg.stub;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService   {

    public List<String> getTodos(String user) {

        return Arrays.asList(" Use Core Java ", "Spring Boot","Use Spring Core ", " Use Hibernate ", " Use Spring MVC ");
    }
}