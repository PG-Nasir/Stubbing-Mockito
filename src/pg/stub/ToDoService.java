package pg.stub;

import java.util.List;

public interface ToDoService {
    public List<String> getTodos(String user);
}
