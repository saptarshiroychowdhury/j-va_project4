package com.example.todo;

import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TodoServiceTest {
    @Test
    public void testAddAndCompleteTodo() {
        TodoService service = new TodoService();
        Todo todo = service.addTodo("Learn DevOps");

        assertThat(todo.getTask()).isEqualTo("Learn DevOps");
        assertThat(todo.isCompleted()).isFalse();

        service.markCompleted(todo.getId());
        assertThat(todo.isCompleted()).isTrue();
    }
}
