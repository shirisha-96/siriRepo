package com.siri.bootjpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//this is the model class which is a connection to the database filed names should be in the form and model class
//entity anno represents that it is a db registered class
@Entity
public class Alien {

	@Id
	private int aid;
	private String aname;
	private String tech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	
}
