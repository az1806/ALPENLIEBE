package com.entity;

public class Type {
	private int id;
	private String leixing;
	public Type(int id, String leixing) {
		super();
		this.id = id;
		this.leixing = leixing;
	}
	public Type() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLeixing() {
		return leixing;
	}
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", leixing=" + leixing + "]";
	}
	
}
