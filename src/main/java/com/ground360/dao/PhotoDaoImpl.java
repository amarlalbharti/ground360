package com.ground360.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.ground360.domain.News;
import com.ground360.domain.Photo;

public class PhotoDaoImpl implements PhotoDao{

	@Autowired private SessionFactory sessionFactory;
	
	public int addPhoto(Photo photo)
	{
		this.sessionFactory.getCurrentSession().save(photo);
		this.sessionFactory.getCurrentSession().flush();
		return photo.getPid();
	}
	
	public boolean updatePhoto(Photo photo)
	{
		try {
			this.sessionFactory.getCurrentSession().update(photo);
			this.sessionFactory.getCurrentSession().flush();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Photo getPhotoByPid(int pid)
	{
		return (Photo)this.sessionFactory.getCurrentSession().get(Photo.class, pid);
	}
	
	@SuppressWarnings("unchecked")
	public List<Photo> getPhotoList(int first, int max)
	{
		return this.sessionFactory.getCurrentSession().createCriteria(News.class)
				.add(Restrictions.isNull("deleteDate"))
				.add(Restrictions.isNotNull("publishDate"))
				.addOrder(Order.asc("publishDate"))
				.setFirstResult(first)
				.setMaxResults(max)
				.list();
		
	}

}
