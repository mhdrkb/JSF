package com.coderbd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_class")
public class StudentClass {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "class_name")
	private final String className;
	@Column(name = "note")
	private final String note;
	public StudentClass(String className, String note) {
		super();
		this.className = className;
		this.note = note;
	}
	public String getClassName() {
		return className;
	}
	public String getNote() {
		return note;
	}
	
	
	
}
