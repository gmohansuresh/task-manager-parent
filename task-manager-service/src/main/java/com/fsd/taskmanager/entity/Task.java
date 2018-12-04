package com.fsd.taskmanager.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	 
	public Task() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="task_id")
	int taskId;
	@Column(name="parent_task")
	String parentTask;
	String task;
	int priority;
	Date startDate;
	Date endDate;
	String status;
	@Column(name="parent_id")
	int parentTaskId;
	 
	 
	public Task(int taskId, String parentTask, String task, int priority, Date startDate, Date endDate,
			int parentTaskId,String status) {
		super();
		this.taskId = taskId;
		this.parentTask = parentTask;
		this.task = task;
		this.priority = priority;
		this.startDate = startDate;
		this.endDate = endDate;
		this.parentTaskId = parentTaskId;
		this.status=status;
	}
	public int getParentTaskId() {
		return parentTaskId;
	}
	public void setParentTaskId(int parentTaskId) {
		this.parentTaskId = parentTaskId;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getParentTask() {
		return parentTask;
	}
	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	 
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	 
	 

}
