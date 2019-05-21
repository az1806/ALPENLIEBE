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
			}
			
			System.out.println(com);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return com;
	}
	
}
