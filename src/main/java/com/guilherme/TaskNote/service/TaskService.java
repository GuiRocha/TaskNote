package com.guilherme.TaskNote.service;

import com.guilherme.TaskNote.Model.Task;

import java.util.List;

public interface TaskService {
    public List<Task> getAllToDo();
    public Task getToDoById(Long id);
    public Task saveToDo(Task task);
    public void removeToDo(Task task);
}
