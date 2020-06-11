package com.guilherme.TaskNote.service.impl;

import com.guilherme.TaskNote.Model.Task;
import com.guilherme.TaskNote.repository.TaskRepository;
import com.guilherme.TaskNote.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public List<Task> getTaskById(Long id) {
        return taskRepository.findAllById(Collections.singleton(id));
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void removeTask(Task task) {
        taskRepository.delete(task);
    }
}
