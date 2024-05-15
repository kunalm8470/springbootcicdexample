package com.cicdexample.todolist.services;

import com.cicdexample.todolist.models.Todo;

import java.util.List;

public interface ITodoService {
    List<Todo> generateTodoItems();
}
