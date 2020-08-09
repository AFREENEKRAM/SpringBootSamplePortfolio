package com.afreen.Sample.basicinfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "basicinfo")
public class basicinfoModel {

	@Id
	@Column(name = "id")
	private Integer id;

	@NotNull
	@Column(name = "first_name")
	private String firstname;
	
	@NotNull
	@Column(name = "last_name")
	private String last_name;
	
	@NotNull
	@Column(name = "email")
	private String email;
	
	@NotNull
	@Column(name = "career")
	private String career;
	
	@NotNull
	@Column(name = "linkedinprofile")
	private String linkedinprofile;
	
	@NotNull
	@Column(name = "objective")
	private String objective;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getLinkedinprofile() {
		return linkedinprofile;
	}

	public void setLinkedinprofile(String linkedinprofile) {
		this.linkedinprofile = linkedinprofile;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}


	
	
}
