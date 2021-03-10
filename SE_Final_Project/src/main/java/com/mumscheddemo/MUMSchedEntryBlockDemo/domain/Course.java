package com.mumscheddemo.MUMSchedEntryBlockDemo.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Course {

	private int courseID;
	private String courseName;
	private Student student;
	private Section section;

	public Course() {
	}

	public Course(int id, String courseName) {
		super();
		this.courseID = id;
		this.courseName = courseName;
	}

	public int getId() {
		return courseID;
	}

	public void setId(int id) {
		this.courseID = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

}
