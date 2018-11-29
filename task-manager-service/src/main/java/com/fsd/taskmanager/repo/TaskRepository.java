package com.fsd.taskmanager.repo;

import org.springframework.data.repository.CrudRepository;

import com.fsd.taskmanager.entity.Task;
 
public interface TaskRepository extends CrudRepository<Task, Long>{
	
}