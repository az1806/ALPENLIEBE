package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.TypeDao1;
import com.entity.Type1;
import com.util.JDBC;

public class TypeDaoImpl1 implements TypeDao1{
	public List<Type1> queryType1() {
		List<Type1> pts1 = new ArrayList<Type1>();
		ResultSet rs1 = JDBC.querySQL("select * from sugar_type1 ;");
		try {
			while (rs1.next()) {
				Type1 pt1 = new Type1();

				pt1.setId(rs1.getInt(1));
				pt1.setBaozhuang(rs1.getString(2));
				pts1.add(pt1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pts1;
	}
}
