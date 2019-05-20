package com.entity;

public class Company {
	private int id;
	private String name;
	private String QQ;
	private String weixin;
	private String dianhua;
	private String dizhi;
	private String zctime;
	public Company(int id, String name, String qQ, String weixin,
			String dianhua, String dizhi, String zctime) {
		super();
		this.id = id;
		this.name = name;
		QQ = qQ;
		this.weixin = weixin;
		this.dianhua = dianhua;
		this.dizhi = dizhi;
		this.zctime = zctime;
	}
	
	public Company(){
		
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

	public String getQQ() {
		return QQ;
	}

	public void setQQ(String qQ) {
		QQ = qQ;
	}

	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public String getDianhua() {
		return dianhua;
	}

	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}

	public String getZctime() {
		return zctime;
	}

	public void setZctime(String zctime) {
		this.zctime = zctime;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", QQ=" + QQ
				+ ", weixin=" + weixin + ", dianhua=" + dianhua + ", dizhi="
				+ dizhi + ", zctime=" + zctime + "]";
	}
	
	
}
