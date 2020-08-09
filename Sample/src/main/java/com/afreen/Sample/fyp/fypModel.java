package com.afreen.Sample.fyp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "fyp")
public class fypModel {

	@Id
	@Column(name = "id")
	private Integer id;

	@NotNull
	@Column(name = "forcompany")
	private String forcompany;
	
	@NotNull
	@Column(name = "fypname")
	private String fypname;
	
	@NotNull
	@Column(name = "technology")
	private String technology;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getForcompany() {
		return forcompany;
	}

	public void setForcompany(String forcompany) {
		this.forcompany = forcompany;
	}

	public String getFypname() {
		return fypname;
	}

	public void setFypname(String fypname) {
		this.fypname = fypname;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}
