package com.mumscheddemo.MUMSchedEntryBlockDemo.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Entry {

	private int id;

	private String entryName;
	private int FPPNum;
	private int MPPNum;
	private Date startDate;
	private Date endDate;
	private Set<Block> blockList = new HashSet<Block>();
	private Set<Section> sectionList = new HashSet<>();

	public Entry() {
	}

	public int getEntryID() {
		return id;
	}

	public void setEntryID(int entryID) {
		this.id = entryID;
	}

	public int getFPPNum() {
		return FPPNum;
	}

	public void setFPPNum(int FPPNum) {
		this.FPPNum = FPPNum;
	}

	public int getMPPNum() {
		return MPPNum;
	}

	public void setMPPNum(int MPPNum) {
		this.MPPNum = MPPNum;
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

	public String getEntryName() {
		return entryName;
	}

	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}


}
