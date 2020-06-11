package com.guilherme.TaskNote.service;

import com.guilherme.TaskNote.Model.Task;
import com.guilherme.TaskNote.exception.TaskException;

import java.util.List;

public interface TaskService {
    public List<Task> getAllTask();
    public Task getTaskById(Long id) throws TaskException;
    public Task saveTask(Task task);
    public void removeTask(Task task);
}
