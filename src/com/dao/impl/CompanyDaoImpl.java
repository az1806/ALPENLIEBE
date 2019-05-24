package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.CompanyDao;
import com.entity.Company;
import com.util.JDBC;

public class CompanyDaoImpl implements CompanyDao{

	public int updateCompany(Company com) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Company queryCompany() {
Company com = new Company();
		
		ResultSet rs = JDBC.querySQL("select * from company_information ;");
		try {
			while (rs.next()){
				com.setId(rs.getInt(1));
				com.setName(rs.getString(2));
				com.setEmail(rs.getString(3));
				com.setQQ(rs.getString(4));
				com.setWeixin(rs.getString(5));
				com.setDianhua(rs.getString(6));
				com.setDizhi(rs.getString(7));
				com.setZctime(rs.getString(8));
				com.setJianjie(rs.getString(9));
				com.setFazhan(rs.getString(10));
				com.setLogo(rs.getString(11));
				com.setFigure(rs.getString(12));
				com.setGywm(rs.getString(13));
				com.setGywm1(rs.getString(14));
				com.setTang(rs.getString(15));
				com.setUrl(rs.getString(16));
			}
			
			System.out.println(com);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return com;
	}

}
