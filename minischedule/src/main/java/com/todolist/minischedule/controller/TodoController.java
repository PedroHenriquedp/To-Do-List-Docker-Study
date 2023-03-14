package com.todolist.minischedule.controller;

import com.todolist.minischedule.model.TodoItem;
import com.todolist.minischedule.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
@CrossOrigin(origins="*", allowedHeaders="*")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @PutMapping
    public TodoItem update (@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping(value ="/{id}")
    public void delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }
}
