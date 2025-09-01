package com.example.todo.controller;

import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Todo> getTodos() {
        return service.getAllTodos();
    }

    @PostMapping
    public Todo addTodo(@RequestParam String task) {
        return service.addTodo(task);
    }

    @PutMapping("/{id}/complete")
    public Todo completeTodo(@PathVariable int id) {
        return service.markCompleted(id);
    }
}
