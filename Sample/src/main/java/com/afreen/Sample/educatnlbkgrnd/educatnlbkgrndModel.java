package com.afreen.Sample.educatnlbkgrnd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "educationalbg")
public class educatnlbkgrndModel {

	@Id
	@Column(name = "id")
	private Integer id;

	@NotNull
	@Column(name = "degree")
	private String degree;
	
	@NotNull
	@Column(name = "degreetitle")
	private String degreetitle;
	
	@NotNull
	@Column(name = "institute")
	private String institute;
	
	@NotNull
	@Column(name = "passingyear")
	private String passingyear;
	
	@NotNull
	@Column(name = "score")
	private String score;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	

	public String getDegreetitle() {
		return degreetitle;
	}

	public void setDegreetitle(String degreetitle) {
		this.degreetitle = degreetitle;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	
}
