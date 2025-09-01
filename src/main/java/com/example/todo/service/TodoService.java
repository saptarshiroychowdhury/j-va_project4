package com.example.todo.service;

import com.example.todo.model.Todo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private final List<Todo> todos = new ArrayList<>();
    private int counter = 1;

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo addTodo(String task) {
        Todo todo = new Todo(counter++, task, false);
        todos.add(todo);
        return todo;
    }

    public Todo markCompleted(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.setCompleted(true);
                return todo;
            }
        }
        return null;
    }
}
