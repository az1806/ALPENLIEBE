package com.dao;

import com.entity.Message;

public interface MessageDao {
int updateMessage(Message a1);
	
	Message queryMessage();
}
