package com.entity;

public class News {
	private int id;
	private String biaoti;
	private String neirong;
	private String time;
	private int ids;
	public News(int id, String biaoti, String neirong, String time, int ids) {
		super();
		this.id = id;
		this.biaoti = biaoti;
		this.neirong = neirong;
		this.time = time;
		this.ids = ids;
	}
	public News() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBiaoti() {
		return biaoti;
	}
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	public String getNeirong() {
		return neirong;
	}
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", biaoti=" + biaoti + ", neirong=" + neirong
				+ ", time=" + time + ", ids=" + ids + "]";
	}

	

	
	
}
