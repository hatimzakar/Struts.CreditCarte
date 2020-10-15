package com.projet.web;

public class formAction {
	private String name;
	private String lastname;
	
	
	
	
	
	public String  Afficher()
	{
		System.out.println(this.name+this.lastname);
		
		return "success";
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	

}
