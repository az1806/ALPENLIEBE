package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.NewsDao;

import com.entity.News;
import com.entity.NewsType;

import com.util.JDBC;

public class NewsDaoImpl implements NewsDao {

	public List<News> queryNews(int type1) {
List<News> com= new ArrayList<News>();
		
		ResultSet rs = JDBC.querySQL("select * from news where ids ="+type1);
		try {
			while (rs.next()){
				News p=new News();
				p.setId(rs.getInt(1));
				p.setBiaoti(rs.getString(2));
				p.setNeirong(rs.getString(3));
				p.setTime(rs.getString(4));
				p.setIds(rs.getInt(5));
				com.add(p);
			}
			
			System.out.println(com);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return com;
	}

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
