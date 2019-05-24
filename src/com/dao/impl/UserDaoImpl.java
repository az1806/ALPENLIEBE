package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.UserDao;
import com.entity.User;
import com.util.JDBC;

public class UserDaoImpl implements UserDao{

	public List<User> queryUser() {
		List<User> c = new ArrayList<User>();
		ResultSet rs = JDBC.querySQL("select * from user_management ;");
		try {
			while (rs.next()) {
				User pt = new User();
				pt.setId(rs.getInt(1));
				pt.setName(rs.getString(2));
				pt.setZhanghao(rs.getString(2));
				pt.setMima(rs.getString(2));
				pt.setQq(rs.getString(2));
				pt.setWeixin(rs.getString(2));
				pt.setDianhua(rs.getInt(2));
				pt.setTu1(rs.getString(2));
				pt.setTu2(rs.getString(2));
				c.add(pt);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	
}
