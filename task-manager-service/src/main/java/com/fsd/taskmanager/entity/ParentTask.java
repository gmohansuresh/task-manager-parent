package com.fsd.taskmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parent_task")
public class ParentTask {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="task_id")
int parent_id;
String parent_task;
}
