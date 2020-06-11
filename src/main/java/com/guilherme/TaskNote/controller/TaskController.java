package com.guilherme.TaskNote.controller;

import com.guilherme.TaskNote.Model.Task;
import com.guilherme.TaskNote.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    TaskService taskService;

    @RequestMapping(value="/task", method= RequestMethod.GET)
    public ResponseEntity<List<Task>> getAllTasks(){
        logger.info("Monstrando todas as Tasks");
        return new ResponseEntity<List<Task>>(taskService.getAllTask(), HttpStatus.OK);
    }


}
