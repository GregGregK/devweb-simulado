package com.example.task_manager.entities;


import jakarta.persistence.*;
import lombok.*;


@Table(name = "tasks")
@Entity(name = "tasks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean completed;


}

