package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.MessageDao;
import com.entity.Company;
import com.entity.Message;
import com.util.JDBC;

public class MessageDaoImpl	implements MessageDao {

	public int updateMessage(Message a1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Message queryMessage() {
Message a1 = new Message();
		
		ResultSet rs = JDBC.querySQL("select * from message_information ;");
		try {
			while (rs.next()){
				a1.setId(rs.getInt(1));
				a1.setName(rs.getString(2));
				a1.setQqly(rs.getString(3));
				a1.setWxly(rs.getString(4));
				a1.setTime(rs.getString(5));
				a1.setLyzt(rs.getString(6));
				a1.setDzrs(rs.getInt(7));
			}
			
			System.out.println(a1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a1;
	}
	

}
