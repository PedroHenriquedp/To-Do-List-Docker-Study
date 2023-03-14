package com.todolist.minischedule.repository;

import com.todolist.minischedule.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {

}
