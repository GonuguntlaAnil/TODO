package com.anil.controller;

import com.anil.entity.ToDo;
import com.anil.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {

    @Autowired
    private ToDoRepository repo;

    // Endpoint to get all ToDos
    @GetMapping
    public List<ToDo> getAllToDos() {
        return repo.findAll();
    }

    // Endpoint to get a ToDo by ID
    @GetMapping("/{id}")
    public ToDo getToDoById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);  // Fetch ToDo by ID
    }

    // Endpoint to create a new ToDo
    @PostMapping
    public ToDo createToDo(@RequestBody ToDo toDo) {
        return repo.save(toDo);  // Save new ToDo
    }

    // Endpoint to update a ToDo by ID
    @PutMapping("/{id}")
    public ToDo updateToDo(@PathVariable Long id, @RequestBody ToDo toDo) {
        toDo.setId(id);  // Set the ID to match the path variable
        return repo.save(toDo);  // Save the updated ToDo
    }

    // Endpoint to delete a ToDo by ID
    @DeleteMapping("/{id}")
    public void deleteToDo(@PathVariable Long id) {
        repo.deleteById(id);  // Delete the ToDo by ID
    }
}
