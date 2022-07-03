package com.homework.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Entity
@Table(name="employers")
//@EqualsAndHashCode(callSuper = false)
//@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")


public class Employer extends Users{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="sirket_adi")
	private String sirketAdi;
	
	@Column(name="website")
	private String website;
	
	@Column(name="telefon")
	private String telefon;
	
	
	
	


	
	public Employer() {
		super();
	}

	public Employer(int id, String sirketAdi, String website, String telefon) {
		super();
		this.id = id;
	
		this.sirketAdi = sirketAdi;
		this.website = website;
		this.telefon = telefon;
	}

	
	
	public String getSirketAdi() {
		return sirketAdi;
	}

	public void setSirketAdi(String sirketAdi) {
		this.sirketAdi = sirketAdi;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	
	
}
