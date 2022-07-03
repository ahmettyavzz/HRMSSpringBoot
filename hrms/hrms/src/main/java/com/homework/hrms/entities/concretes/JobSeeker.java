package com.homework.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_seeker")
public class JobSeeker extends Users{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="ad")
	private String ad;
	
	@Column(name="soyad")
	private String soyad;
	
	@Column(name="dogum_yili")
	private String dogumYili;
	
	@Column(name="tc_no")
	private String tcNo;

	public JobSeeker(int id, String ad, String soyad, String dogumYili, String tcNo) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumYili = dogumYili;
		this.tcNo = tcNo;
	}

	public JobSeeker() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(String dogumYili) {
		this.dogumYili = dogumYili;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	
	
	


	
	
	
}
