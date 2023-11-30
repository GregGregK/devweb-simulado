package com.example.task_manager.controller;
import com.example.task_manager.entities.Task;
import com.example.task_manager.servico.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;


    @PreAuthorize("hasRole('PRODUCT_SELECT')")
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('PRODUCT_SELECT')")
    public ResponseEntity<?> getTaskById(@PathVariable Long id) {
        return new ResponseEntity<>(taskService.getTaskById(id), HttpStatus.OK);
    }

    @PostMapping
    @PreAuthorize("hasRole('PRODUCT_INSERT')")
    public ResponseEntity<?> createTask(@RequestBody Task task) {
        taskService.createTask(task);
        return new ResponseEntity<>("Task Created", HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('PRODUCT_UPDATE')")
    public ResponseEntity<?> updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        taskService.updateTask(id, taskDetails);
        return new ResponseEntity<>("Task Updated", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('PRODUCT_DELETE')")
    public ResponseEntity<?> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return new ResponseEntity<>("Task Deleted", HttpStatus.OK);
    }
}

