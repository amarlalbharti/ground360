package com.ground360.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.ground360.domain.News;

public class NewsDaoImpl implements NewsDao
{
	@Autowired SessionFactory sessionFactory;
	
	public long addNews(News news){
		this.sessionFactory.getCurrentSession().save(news);
		this.sessionFactory.getCurrentSession().flush();
		return news.getNid();
	}
	
	public boolean updateNews(News news)
	{
		try {
			this.sessionFactory.getCurrentSession().update(news);
			this.sessionFactory.getCurrentSession().flush();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public News getNewsByNewsId(long nid)
	{
		return (News)this.sessionFactory.getCurrentSession().get(News.class, nid);
	}
	
	@SuppressWarnings("unchecked")
	public List<News> getNewsList(int first, int max)
	{
		return this.sessionFactory.getCurrentSession().createCriteria(News.class)
				.add(Restrictions.isNull("deleteDate"))
				.addOrder(Order.asc("publishDate"))
				.setFirstResult(first)
				.setMaxResults(max)
				.list();
	}
	
}
