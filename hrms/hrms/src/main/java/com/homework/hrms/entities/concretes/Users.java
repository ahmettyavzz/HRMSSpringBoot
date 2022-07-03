package com.homework.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)

public class Users {
	

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) //id 1-1 artacak demek

	@Column(name="id")
	private int id;
	
	@Column(name="e_posta")
	private String eMail;
	
	@Column(name="password")
	private String password;
	
	
	
	
	
	public Users() {
		
	}


	public Users(int id, String eMail, String password) {
		super();
		this.id = id;
		this.eMail = eMail;
		this.password = password;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTcNo() {
		return eMail;
	}
	public void setTcNo(String tcNo) {
		this.eMail = tcNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
	
	
	
}
