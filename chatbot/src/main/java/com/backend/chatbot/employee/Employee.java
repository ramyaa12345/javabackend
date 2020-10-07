package com.backend.chatbot.employee;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique=true)
	private String emailId;
	private String name;
	private String college;
	private String password;
	private LocalDate joiningDate;

	public Employee() {
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employee(String emailId, String name, String college, String password, LocalDate joiningDate) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.college = college;
		this.password = password;
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "HR [emailId=" + emailId + ", name=" + name + ", college=" + college + ", password=" + password
				+ ", joiningDate=" + joiningDate + "]";
	}
	
	

}
