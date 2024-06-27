package com.tns.constructor;

public class coustmer {
	private int id;
	private String name;
	
	public coustmer () {
	super();
	this.id=id;
	this.name=name;
	System.out.println("---default constructor---");}
	@Override
	public String toString() {
		return "coustmer [id=" + id + ", name=" + name + "]";
	}

}
