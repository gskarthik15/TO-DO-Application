package com.todo.todo.app.repository;

import com.todo.todo.app.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository<Long> extends JpaRepository<Task, Long> {
}
