package com.entity;

public class Company {
	private int id;
	private String name;
	private String email;
	private String QQ;
	private String weixin;
	private String dianhua;
	private String dizhi;
	private String zctime;
	private String jianjie;
	private String fazhan;
	private String logo;
	private String figure;
	private String gywm;
	private String gywm1;
	private String tang;
	private String url;
	public Company(int id, String name, String email, String qQ, String weixin,
			String dianhua, String dizhi, String zctime, String jianjie,
			String fazhan, String logo, String figure, String gywm,
			String gywm1, String tang, String url) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		QQ = qQ;
		this.weixin = weixin;
		this.dianhua = dianhua;
		this.dizhi = dizhi;
		this.zctime = zctime;
		this.jianjie = jianjie;
		this.fazhan = fazhan;
		this.logo = logo;
		this.figure = figure;
		this.gywm = gywm;
		this.gywm1 = gywm1;
		this.tang = tang;
		this.url = url;
	}
	public Company() {
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getJianjie() {
		return jianjie;
	}
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	public String getFazhan() {
		return fazhan;
	}
	public void setFazhan(String fazhan) {
		this.fazhan = fazhan;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getFigure() {
		return figure;
	}
	public void setFigure(String figure) {
		this.figure = figure;
	}
	public String getGywm() {
		return gywm;
	}
	public void setGywm(String gywm) {
		this.gywm = gywm;
	}
	public String getGywm1() {
		return gywm1;
	}
	public void setGywm1(String gywm1) {
		this.gywm1 = gywm1;
	}
	public String getTang() {
		return tang;
	}
	public void setTang(String tang) {
		this.tang = tang;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", email=" + email
				+ ", QQ=" + QQ + ", weixin=" + weixin + ", dianhua=" + dianhua
				+ ", dizhi=" + dizhi + ", zctime=" + zctime + ", jianjie="
				+ jianjie + ", fazhan=" + fazhan + ", logo=" + logo
				+ ", figure=" + figure + ", gywm=" + gywm + ", gywm1=" + gywm1
				+ ", tang=" + tang + ", url=" + url +"]";
	}
	
}
