package com.anil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anil.entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo,Long>{

}
