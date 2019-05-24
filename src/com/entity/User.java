package com.entity;

public class User {
	private int id;
	private String name;
	private String zhanghao;
	private String mima;
	private String qq;
	private String weixin;
	private int dianhua;
	private String tu1;
	private String tu2;
	public User(int id, String name, String zhanghao, String mima, String qq,
			String weixin, int dianhua, String tu1, String tu2) {
		super();
		this.id = id;
		this.name = name;
		this.zhanghao = zhanghao;
		this.mima = mima;
		this.qq = qq;
		this.weixin = weixin;
		this.dianhua = dianhua;
		this.tu1 = tu1;
		this.tu2 = tu2;
	}
	public User() {
		
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
	public String getZhanghao() {
		return zhanghao;
	}
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	public String getMima() {
		return mima;
	}
	public void setMima(String mima) {
		this.mima = mima;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public int getDianhua() {
		return dianhua;
	}
	public void setDianhua(int dianhua) {
		this.dianhua = dianhua;
	}
	public String getTu1() {
		return tu1;
	}
	public void setTu1(String tu1) {
		this.tu1 = tu1;
	}
	public String getTu2() {
		return tu2;
	}
	public void setTu2(String tu2) {
		this.tu2 = tu2;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", zhanghao=" + zhanghao
				+ ", mima=" + mima + ", qq=" + qq + ", weixin=" + weixin
				+ ", dianhua=" + dianhua + ", tu1=" + tu1 + ", tu2=" + tu2
				+ "]";
	}
	
}
