package com.entity;

public class Product {
	private int id;
	private String name;
	private String baozhuang;
	private int jiage;
	private int kucun;
	private String tupian;
	private String jianjie;
	private int ids;
	public Product(int id, String name, String baozhuang, int jiage, int kucun,
			String tupian, String jianjie, int ids) {
		super();
		this.id = id;
		this.name = name;
		this.baozhuang = baozhuang;
		this.jiage = jiage;
		this.kucun = kucun;
		this.tupian = tupian;
		this.jianjie = jianjie;
		this.ids = ids;
	}
	public Product() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBaozhuang() {
		return baozhuang;
	}
	public void setBaozhuang(String baozhuang) {
		this.baozhuang = baozhuang;
	}
	public int getJiage() {
		return jiage;
	}
	public void setJiage(int jiage) {
		this.jiage = jiage;
	}
	public int getKucun() {
		return kucun;
	}
	public void setKucun(int kucun) {
		this.kucun = kucun;
	}
	public String getTupian() {
		return tupian;
	}
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	public String getJianjie() {
		return jianjie;
	}
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", baozhuang="
				+ baozhuang + ", jiage=" + jiage + ", kucun=" + kucun
				+ ", tupian=" + tupian + ", jianjie=" + jianjie + ", ids="
				+ ids + "]";
	}
	
	
}
