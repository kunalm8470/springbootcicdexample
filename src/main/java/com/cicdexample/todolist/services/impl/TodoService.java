package com.cicdexample.todolist.services.impl;

import com.cicdexample.todolist.models.Todo;
import com.cicdexample.todolist.services.ITodoService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class TodoService implements ITodoService {
    public List<Todo> generateTodoItems() {
        return IntStream.range(0, 5)
                .mapToObj(i -> generateRandomTodo())
                .collect(Collectors.toList());
    }

    private static Todo generateRandomTodo() {
        Faker faker = new Faker();

        Todo newTodo = new Todo();

        newTodo.setId(UUID.randomUUID().toString());
        newTodo.setTitle(faker.lorem().sentence());
        newTodo.setDescription(faker.lorem().paragraph());
        newTodo.setCompleted(faker.bool().bool());

        return newTodo;
    }
}
