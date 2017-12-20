package com.example.todotest.controller;

import com.example.todotest.model.Todo;
import com.example.todotest.repository.TodoRepository;
import com.example.todotest.rules.TodoRules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {
    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/todo")
    public List<Todo> get() {
        return todoRepository.findAll();
    }

    @GetMapping("/todo/{id}")
    public ResponseEntity<Todo> getById(@PathVariable(value = "id") Long id) {
        Todo todo = todoRepository.findOne(id);
        if (todo == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(todo);
    }

    @PostMapping("/todo")
    public Todo post(@Valid @RequestBody Todo todo){
        return todoRepository.save(todo);
    }

    @PutMapping("/todo/{id}")
    public ResponseEntity<Todo> put(@PathVariable(value = "id") Long id,
                                    @Valid @RequestBody Todo requestTodo) {
        Todo todo = todoRepository.findOne(id);
        if (todo == null)
            return ResponseEntity.notFound().build();

        TodoRules.updateTodo(todo, requestTodo);
        Todo updatedTodo = todoRepository.save(todo);
        return ResponseEntity.ok().body(updatedTodo);
    }

    @DeleteMapping("/todo/{id}")
    public ResponseEntity<Todo> delete(@PathVariable(value = "id") Long id) {
        Todo todo = todoRepository.findOne(id);
        if (todo == null)
            return ResponseEntity.notFound().build();
        todoRepository.delete(todo);
        return ResponseEntity.ok().build();
    }
}
