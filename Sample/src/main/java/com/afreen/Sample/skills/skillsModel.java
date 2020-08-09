package com.afreen.Sample.skills;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "skills")
public class skillsModel {

	@Id
	@Column(name = "id")
	private Integer id;

	@NotNull
	@Column(name = "progrmglang")
	private String progrmglang;
	
	@NotNull
	@Column(name = "weblang")
	private String weblang;
	
	@NotNull
	@Column(name = "db")
	private String db;
	
	@NotNull
	@Column(name = "framework")
	private String framework;
	
	@NotNull
	@Column(name = "technologies")
	private String technologies;
	
	@NotNull
	@Column(name = "others")
	private String others;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getProgrmglang() {
		return progrmglang;
	}

	public void setProgrmglang(String progrmglang) {
		this.progrmglang = progrmglang;
	}

	public String getWeblang() {
		return weblang;
	}

	public void setWeblang(String weblang) {
		this.weblang = weblang;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}
	
	
}
