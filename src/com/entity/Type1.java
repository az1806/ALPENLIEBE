package com.entity;

public class Type1 {
	private int id;
	private String baozhuang;
	public Type1(int id, String baozhuang) {
		super();
		this.id = id;
		this.baozhuang = baozhuang;
	}
	public Type1() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBaozhuang() {
		return baozhuang;
	}
	public void setBaozhuang(String baozhuang) {
		this.baozhuang = baozhuang;
	}
	@Override
	public String toString() {
		return "Type1 [id=" + id + ", baozhuang=" + baozhuang + "]";
	}
	
}
