package com.otv;

import java.io.Serializable;

import org.apache.log4j.Logger;

/**
 * @author onlinetechvision.com
 * @since 3 Oct 2011
 * @version 1.0.0
 *
 */
public class UserManagedBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(UserManagedBean.class);
	private static final String SUCCESS = "success";
	private String name;
	private String surname;
	private String message;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMessage() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append(this.getName());
		strBuff.append(" ");
		strBuff.append(this.getSurname());
		this.setMessage(strBuff.toString());
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}	
		
	public String submit() {		
		return SUCCESS;
	}
	
	public void reset() {
		this.setName("");
		this.setSurname("");
	}	
}