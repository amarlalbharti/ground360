package com.ground360.dao;

import java.util.List;

import com.ground360.domain.News;

public interface NewsDao {

	public long addNews(News news);
	
	public boolean updateNews(News news);
	
	public News getNewsByNewsId(long nid);
	
	public List<News> getNewsList(int first, int max);
	
	
}
