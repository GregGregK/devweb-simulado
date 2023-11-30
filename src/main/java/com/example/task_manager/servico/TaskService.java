package com.example.task_manager.servico;

import com.example.task_manager.entities.Task;
import com.example.task_manager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public void createTask(Task task) {
        taskRepository.save(task);
    }

    public void updateTask(Long id, Task taskDetails) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            Task existingTask = optionalTask.get();
            existingTask.setTitle(taskDetails.getTitle());
            existingTask.setDescription(taskDetails.getDescription());
            existingTask.setCompleted(taskDetails.isCompleted());
            taskRepository.save(existingTask);
        }
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
