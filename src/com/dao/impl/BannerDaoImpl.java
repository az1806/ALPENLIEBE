package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.BannerDao;
import com.entity.Banner;
import com.entity.Banner;

import com.util.JDBC;


public class BannerDaoImpl implements BannerDao{

	public List<Banner> queryBanner() {
		List<Banner> pts1 = new ArrayList<Banner>();
		ResultSet rs = JDBC.querySQL("select * from banner ;");
		try {
			while (rs.next()) {
				Banner pt = new Banner();

				pt.setId(rs.getInt(1));
				pt.setTu(rs.getString(2));
				pts1.add(pt);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pts1;
	}

	

	}
	

