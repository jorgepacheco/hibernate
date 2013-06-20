package com.nhpatt.hibernate.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class User {

	@Id
	private Integer id;
	@Column(name = "userName")
	private String name;
	@Column(name = "surname", nullable = false)
	private String surname;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

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

	@Transient
	public String getFullName() {
		return name + " " + surname;
	}

}
