package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usertable")
public class UserModel {
	@Id
	private int id;
	private String name;
	private int age;
	private String address;
	private String email;
	private int contact;
	private String occupation;
	private String review;
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserModel(int id,String name, int age, String address, String email, int contact, String occupation,
			String review) {
		super();
		this.id=id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.contact = contact;
		this.occupation = occupation;
		this.review = review;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	

}
