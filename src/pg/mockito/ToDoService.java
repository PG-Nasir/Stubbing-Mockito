package pg.mockito;

import java.util.List;

public interface ToDoService {
    public List<String> getTodos(String user);
}
