package com.platform.entity;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String sName;
	private String sAddress;
	private String contactNo;
	
	
	
	public Student(int id, String sName, String sAddress, String contactNo) {
		this.id = id;
		this.sName = sName;
		this.sAddress = sAddress;
		this.contactNo = contactNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", sName=" + sName + ", sAddress=" + sAddress + ", contactNo=" + contactNo + "]";
	}
	
	
}
