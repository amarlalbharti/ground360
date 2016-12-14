package com.ground360.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ground360.domain.News;

public class NewsServiceImpl implements NewsService
{
	@Autowired private NewsService newsService;
	
	public long addNews(News news)
	{
		return this.newsService.addNews(news);
	}
	
	public boolean updateNews(News news)
	{
		return this.newsService.updateNews(news);
	}
	
	public News getNewsByNewsId(long nid)
	{
		return this.newsService.getNewsByNewsId(nid);
	}
	
	public List<News> getNewsList(int first, int max)
	{
		return this.newsService.getNewsList(first, max);
	}
	
}
