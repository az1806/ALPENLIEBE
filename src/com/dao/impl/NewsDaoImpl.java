package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.NewsDao;

import com.entity.News;
import com.util.JDBC;

public class NewsDaoImpl implements NewsDao{

	public int updateNews(News com) {
		// TODO Auto-generated method stub
		return 0;
	}

	public News queryNews() {
		News a = new News();
		
		ResultSet rs = JDBC.querySQL("select * from news_center ;");
		try {
			while (rs.next()){
				a.setId(rs.getInt(1));
				a.setHybt(rs.getString(2));
				a.setHynr(rs.getString(3));
				a.setHysj(rs.getString(4));
				a.setXcpbt(rs.getString(5));
				a.setXcpnr(rs.getString(6));
				a.setXcpsj(rs.getString(7));
				a.setHdbt(rs.getString(8));
				a.setHdnr(rs.getString(9));
				a.setHdsj(rs.getString(10));
				a.setDzrs(rs.getInt(11));
				a.setLljl(rs.getInt(12));
			}
			
			System.out.println(a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a;
	}
	
}
