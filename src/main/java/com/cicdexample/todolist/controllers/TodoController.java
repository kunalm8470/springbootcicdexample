package com.cicdexample.todolist.controllers;

import com.cicdexample.todolist.models.Todo;
import com.cicdexample.todolist.services.ITodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final ITodoService todoService;

    public TodoController(ITodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public ResponseEntity<List<Todo>> GetAllTodoItems() {
        return ResponseEntity.ok(todoService.generateTodoItems());
    }
}
