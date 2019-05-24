package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.NewsTypeDao;
import com.entity.NewsType;

import com.util.JDBC;

public class NewsTypeDaoImpl implements NewsTypeDao{

	public List<NewsType> queryNewsType() {
		List<NewsType> pts = new ArrayList<NewsType>();
		ResultSet rs = JDBC.querySQL("select * from news_type ;");
		try {
			while (rs.next()) {
				NewsType pt = new NewsType();

				pt.setId(rs.getInt(1));
				pt.setName(rs.getString(2));
				pts.add(pt);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pts;
	}
		
}
