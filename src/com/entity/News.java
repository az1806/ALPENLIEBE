package com.entity;

public class News {
	private int id;
	private String hybt;
	private String hynr;
	private String hysj;
	private String xcpbt;
	private String xcpnr;
	private String xcpsj;
	private String hdbt;
	private String hdnr;
	private String hdsj;
	private int dzrs;
	private int lljl;
	public News(int id, String hybt, String hynr, String hysj, String xcpbt,
			String xcpnr, String xcpsj, String hdbt, String hdnr, String hdsj,
			int dzrs, int lljl) {
		super();
		this.id = id;
		this.hybt = hybt;
		this.hynr = hynr;
		this.hysj = hysj;
		this.xcpbt = xcpbt;
		this.xcpnr = xcpnr;
		this.xcpsj = xcpsj;
		this.hdbt = hdbt;
		this.hdnr = hdnr;
		this.hdsj = hdsj;
		this.dzrs = dzrs;
		this.lljl = lljl;
	}
	
	public News() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHybt() {
		return hybt;
	}

	public void setHybt(String hybt) {
		this.hybt = hybt;
	}

	public String getHynr() {
		return hynr;
	}

	public void setHynr(String hynr) {
		this.hynr = hynr;
	}

	public String getHysj() {
		return hysj;
	}

	public void setHysj(String hysj) {
		this.hysj = hysj;
	}

	public String getXcpbt() {
		return xcpbt;
	}

	public void setXcpbt(String xcpbt) {
		this.xcpbt = xcpbt;
	}

	public String getXcpnr() {
		return xcpnr;
	}

	public void setXcpnr(String xcpnr) {
		this.xcpnr = xcpnr;
	}

	public String getXcpsj() {
		return xcpsj;
	}

	public void setXcpsj(String xcpsj) {
		this.xcpsj = xcpsj;
	}

	public String getHdbt() {
		return hdbt;
	}

	public void setHdbt(String hdbt) {
		this.hdbt = hdbt;
	}

	public String getHdnr() {
		return hdnr;
	}

	public void setHdnr(String hdnr) {
		this.hdnr = hdnr;
	}

	public String getHdsj() {
		return hdsj;
	}

	public void setHdsj(String hdsj) {
		this.hdsj = hdsj;
	}

	public int getDzrs() {
		return dzrs;
	}

	public void setDzrs(int dzrs) {
		this.dzrs = dzrs;
	}

	public int getLljl() {
		return lljl;
	}

	public void setLljl(int lljl) {
		this.lljl = lljl;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", hybt=" + hybt + ", hynr=" + hynr
				+ ", hysj=" + hysj + ", xcpbt=" + xcpbt + ", xcpnr=" + xcpnr
				+ ", xcpsj=" + xcpsj + ", hdbt=" + hdbt + ", hdnr=" + hdnr
				+ ", hdsj=" + hdsj + ", dzrs=" + dzrs + ", lljl=" + lljl + "]";
	}
	
	
}
