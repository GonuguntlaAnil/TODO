package com.anil.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todo_seq")
    private Long id;

    private String task;
    private boolean completed;
}
