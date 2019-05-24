package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.ProductDao;
import com.entity.Product;
import com.entity.Type;

import com.util.JDBC;

public class ProductDaoImpl	implements ProductDao {

	public List<Product> queryProduct(int type) {
		List<Product> com= new ArrayList<Product>();
		
		ResultSet rs = JDBC.querySQL("select * from product where ids ="+type);
		try {
			while (rs.next()){
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setBaozhuang(rs.getString(3));
				p.setJiage(rs.getInt(4));
				p.setKucun(rs.getInt(5));
				p.setTupian(rs.getString(6));
				p.setJianjie(rs.getString(7));
				p.setIds(rs.getInt(8));
				com.add(p);
			}
			
			System.out.println(com);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return com;
	}

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
