package com.ground360.service;

import java.util.List;

import com.ground360.domain.News;

public interface NewsService {
	
	public long addNews(News news);
	
	public boolean updateNews(News news);
	
	public News getNewsByNewsId(long nid);
	
	public List<News> getNewsList(int first, int max);
	

}
