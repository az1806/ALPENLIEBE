package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.dao.TypeDao;
import com.entity.Type;

import com.util.JDBC;

public class TypeDaoImpl  implements TypeDao{

	public List<Type> queryType() {
		List<Type> pts = new ArrayList<Type>();
		ResultSet rs = JDBC.querySQL("select * from sugar_type ;");
		try {
			while (rs.next()) {
				Type pt = new Type();

				pt.setId(rs.getInt(1));
				pt.setLeixing(rs.getString(2));
				pts.add(pt);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pts;
		
	}

}
