package com.afreen.Sample.jobexpr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "jobexperience")
public class jobexprModel {

	@Id
	@Column(name = "id")
	private Integer id;

	@NotNull
	@Column(name = "companyinfo")
	private String companyinfo;
	
	@NotNull
	@Column(name = "datefrm")
	private String datefrm;
	
	@NotNull
	@Column(name = "dateto")
	private String dateto;
	
	@NotNull
	@Column(name = "wotechnology")
	private String wotechnology;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyinfo() {
		return companyinfo;
	}

	public void setCompanyinfo(String companyinfo) {
		this.companyinfo = companyinfo;
	}

	public String getDatefrm() {
		return datefrm;
	}

	public void setDatefrm(String datefrm) {
		this.datefrm = datefrm;
	}

	public String getDateto() {
		return dateto;
	}

	public void setDateto(String dateto) {
		this.dateto = dateto;
	}

	public String getWotechnology() {
		return wotechnology;
	}

	public void setWotechnology(String wotechnology) {
		this.wotechnology = wotechnology;
	}
	
	
}
