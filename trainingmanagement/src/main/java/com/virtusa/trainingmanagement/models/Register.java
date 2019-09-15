package com.virtusa.trainingmanagement.models;

public class Register
{
	private String empId;
	private String name;
	private String role;
	private String emailId;
	private String password;
	private int phoneNo;

	/*
	 * public Register(String empId, String name,String role, String emailId, String
	 * password, String phoneNo) { // TODO Auto-generated constructor stub
	 * this.empId=empId; this.name=name; this.role=role; this.emailId=emailId;
	 * this.password=password; this.phoneNo=phoneNo; }
	 */
	public Register(String empId,String name,String role,String emailId,String password,int
			  phoneNo) {
			  
			  this.empId= empId;
			  this.name=name;
			  this.role=role;
			  this.password = password; 
			  this.emailId=emailId; 
			  this.phoneNo=phoneNo;
			  
			  }
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmaiId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	  @Override
		public String toString() {
			return "Register [empId=" + empId + ",name="+name+",role="+role+"emailId="+emailId+", password=" + password + ",phoneNo="+phoneNo+"]";
		}
		
}
