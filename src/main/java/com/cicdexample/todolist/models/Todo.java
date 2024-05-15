package com.cicdexample.todolist.models;

import lombok.Data;

@Data
public class Todo {
    private String id;
    private String title;
    private String description;
    private boolean isCompleted;
}
