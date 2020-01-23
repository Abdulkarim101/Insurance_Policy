package com.springboot.customerEntity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "UUID")
	private String uUID;

	@Column(name = "Fname")
	private String fName;

	@Column(name = "Lname")
	private String lName;

	@Column(name = "Email")
	private String email;

	@Column(name = "Phone")
	private String Phone;

	@Column(name = "Created_At")
	private Date createdAt;

	@Column(name = "Updated_At")
	private Date updatedAat;

	@Column(name = "Is_Active")
	private Boolean isActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getuUID() {
		return uUID;
	}

	public void setuUID(String uUID) {
		this.uUID = uUID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		this.Phone = phone;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAat() {
		return updatedAat;
	}

	public void setUpdatedAat(Date updatedAat) {
		this.updatedAat = updatedAat;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	
	}

	


