package com.mumscheddemo.MUMSchedEntryBlockDemo.domain;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Block {
    private int blockID;

    private String blockName;
    private Date startDate;
    private Date endDate;
    private int FPPNum;
    private int MPPNum;
    private String entryName;
    private Entry entry;

    public Block() {
    }

    public Entry getEntry(){
        return entry;
    }

    public int getBlockID() {
        return blockID;
    }

    public void setBlockID(int blockID) {
        this.blockID = blockID;
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

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public void setEntry(Entry entry){
        this.entry = entry;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

	@Override
	public String toString() {
		return "Block [blockID=" + blockID + ", blockName=" + blockName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", FPPNum=" + FPPNum + ", MPPNum=" + MPPNum + ", entryName=" + entryName + ", entry="
				+ entry + "]";
	}

}
