package com.mumscheddemo.MUMSchedEntryBlockDemo.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Section {
	private int sectionID;
	private String sectionName;
	private Set<Course> courseList = new HashSet<>();
	private Entry entry;

	public Section() {

	}

	public Section(String sectionName, Set<Course> courseList) {
		super();
		this.sectionName = sectionName;
		this.courseList = courseList;
	}

	public int getSectionID() {
		return sectionID;
	}

	public void setSectionID(int sectionID) {
		this.sectionID = sectionID;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public Set<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(Set<Course> courseList) {
		this.courseList = courseList;
	}

	public Entry getEntry() {
		return entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}

}
