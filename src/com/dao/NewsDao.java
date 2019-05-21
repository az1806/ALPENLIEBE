package com.dao;

import com.entity.News;

public interface NewsDao {
int updateNews(News a);
	
	News queryNews();
}
