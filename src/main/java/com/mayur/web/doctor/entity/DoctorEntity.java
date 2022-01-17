package com.mayur.web.doctor.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class DoctorEntity {

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
//	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="bldgrp")
	private String bldgrp;
	
	@Column(name="mobno")
	private Long mobno;
	
	@Column(name="email")
	private String emailId;
	
	@Column(name="address")
	private String address; 
	
	@Column(name="doapp")
	private Date dateOfApp; 
	
	@Column(name="filepdf")
	private String filePdf;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getBldgrp() {
		return bldgrp;
	}
	public void setBldgrp(String bldgrp) {
		this.bldgrp = bldgrp;
	}
	
	public Long getMobno() {
		return mobno;
	}
	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDateOfApp() {
		return dateOfApp;
	}
	public void setDateOfApp(Date dateOfApp) {
		this.dateOfApp = dateOfApp;
	}
	public String getFilePdf() {
		return filePdf;
	}
	public void setFilePdf(String filePdf) {
		this.filePdf = filePdf;
	}
	@Override
	public String toString() {
		return "DoctorEntity [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", bldgrp=" + bldgrp
				+ ", mobno=" + mobno + ", emailId=" + emailId + ", address=" + address + ", dateOfApp=" + dateOfApp
				+ ", filePdf=" + filePdf + "]";
	}
	
	
	
	

}
