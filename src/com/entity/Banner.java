package com.entity;

public class Banner {
	private int id;
	private String tu;
	public Banner(int id, String tu) {
		super();
		this.id = id;
		this.tu = tu;
	}
	public Banner() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTu() {
		return tu;
	}
	public void setTu(String tu) {
		this.tu = tu;
	}
	@Override
	public String toString() {
		return "Banner [id=" + id + ", tu=" + tu + "]";
	}
	
}
