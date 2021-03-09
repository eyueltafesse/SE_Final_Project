package com.mumscheddemo.MUMSchedEntryBlockDemo.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Faculty {
	private int facultyID;
	private String facultyName;
	private String email;
	private Set<Student> studentList = new HashSet<Student>();
	private Set<Course> courseList = new HashSet<Course>();

	public Faculty() {
		super();
	}

	public Faculty(int facultyID, String facultyName, String email) {
		super();
		this.facultyID = facultyID;
		this.facultyName = facultyName;
		this.email = email;
	}

	public int getFacultyID() {
		return facultyID;
	}

	public void setFacultyID(int facultyID) {
		this.facultyID = facultyID;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(Set<Student> studentList) {
		this.studentList = studentList;
	}

	public Set<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(Set<Course> courseList) {
		this.courseList = courseList;
	}

}
