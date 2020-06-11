package com.guilherme.TaskNote;

import com.guilherme.TaskNote.Model.Task;
import com.guilherme.TaskNote.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskNoteApplication {
	private static final Logger logger = LoggerFactory.getLogger(TaskNoteApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TaskNoteApplication.class, args);
	}

	@Bean
	public CommandLineRunner setup(TaskRepository taskRepository) {
		return (args) -> {
			taskRepository.save(new Task(null,"Criar um projeto do zero", true));
			taskRepository.save(new Task(null,"fazer deploy do projeto", true));
			taskRepository.save(new Task(null,"API Rest", false));
			taskRepository.save(new Task(null, "AWS amazon", true));

		};
	}
}
