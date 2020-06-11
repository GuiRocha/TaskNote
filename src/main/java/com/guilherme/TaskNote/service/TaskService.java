package com.guilherme.TaskNote.service;

import com.guilherme.TaskNote.Model.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    public List<Task> getAllTask();
    public Task getTaskById(Long id);
    public Task saveTask(Task task);
    public void removeTask(Task task);
}
