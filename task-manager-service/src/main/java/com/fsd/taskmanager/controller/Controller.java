package com.fsd.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fsd.taskmanager.entity.Task;
import com.fsd.taskmanager.service.TaskService;

@CrossOrigin(origins = "*", allowedHeaders="*")
@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	TaskService taskService;
	
	@RequestMapping("/")
	public void me() {
		System.out.println("invoke default");
	}
	
	
	@RequestMapping("/welcome")
	public  @ResponseBody String  welcome() {
		System.out.println("Welcome");
		return "Welcome";
	}
	
	/*@RequestMapping(value="/addTask", method = RequestMethod.POST, produces = "application/json")*/
	@RequestMapping(value="/addTask", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String addTask(@RequestBody Task task) {
		System.out.println("Add Task ");
		ModelAndView mv = new ModelAndView();
		mv.addObject("eterteteT", "dfafadfa");
		taskService.addTask(task);
		return "SUCCESS";
	}
	
	@RequestMapping(value="/deleteTask/{task_id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Task> deleteTask(@PathVariable int task_id) {
		System.out.println("deleteTask   ");
		
		return taskService.deleteTask(task_id);
	}
	
	@RequestMapping(value="/editTask/{task_id}", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String editTask(@RequestBody Task task, @PathVariable int task_id) {
		System.out.println("editTask   ");
		taskService.editTask(task);
		return "updated";
	}
	
	@RequestMapping(value="/viewTask", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Task> viewtask() {
		return taskService.getAllTasks();
	}
	
	
}
