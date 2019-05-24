package com.entity;

public class Message {
	private int id;
	private String name;
	private String qqly;
	private String wxly;
	private String time;
	private String lyzt;
	private int dzrs;
	public Message(int id, String name, String qqly, String wxly, String time,
			String lyzt, int dzrs) {
		super();
		this.id = id;
		this.name = name;
		this.qqly = qqly;
		this.wxly = wxly;
		this.time = time;
		this.lyzt = lyzt;
		this.dzrs = dzrs;
	}
	public Message() {
		
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
	public String getQqly() {
		return qqly;
	}
	public void setQqly(String qqly) {
		this.qqly = qqly;
	}
	public String getWxly() {
		return wxly;
	}
	public void setWxly(String wxly) {
		this.wxly = wxly;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLyzt() {
		return lyzt;
	}
	public void setLyzt(String lyzt) {
		this.lyzt = lyzt;
	}
	public int getDzrs() {
		return dzrs;
	}
	public void setDzrs(int dzrs) {
		this.dzrs = dzrs;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", name=" + name + ", qqly=" + qqly
				+ ", wxly=" + wxly + ", time=" + time + ", lyzt=" + lyzt
				+ ", dzrs=" + dzrs + "]";
	}
	
}
