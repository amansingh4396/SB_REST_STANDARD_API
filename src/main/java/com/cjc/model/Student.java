package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Student 
{

	@Id
	private int rollno ;
	
	private String name ;
	
	private String address ;
	
	private long Contact_NO ;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContact_NO() {
		return Contact_NO;
	}

	public void setContact_NO(long contact_NO) {
		Contact_NO = contact_NO;
	}

	public Student(int rollno, String name, String address, long contact_NO) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		Contact_NO = contact_NO;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", Contact_NO=" + Contact_NO
				+ "]";
	}
	
}
