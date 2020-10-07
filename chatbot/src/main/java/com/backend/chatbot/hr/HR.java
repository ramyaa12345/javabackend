package com.backend.chatbot.hr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hr")
public class HR {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique=true)
	private String emailId;
	private String name;
	private String password;

	public HR() {
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


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public HR(String emailId, String name, String password) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "HR [emailId=" + emailId + ", name=" + name + ", password=" + password
				+ "]";
	}
	
	

}
