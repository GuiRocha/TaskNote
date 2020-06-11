package com.guilherme.TaskNote.service.impl;

import com.guilherme.TaskNote.Model.Task;
import com.guilherme.TaskNote.repository.TaskRepository;
import com.guilherme.TaskNote.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return null;
    }

    @Override
    public Task saveTask(Task task) {
        return null;
    }

    @Override
    public void removeTask(Task task) {

    }
}
