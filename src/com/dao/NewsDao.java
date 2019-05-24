package com.dao;

import java.util.List;

import com.entity.News;
import com.entity.NewsType;


public interface NewsDao {
	List<News> queryNews(int type1);

	List<NewsType> queryNewsType();
}
