package com.ground360.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.ground360.domain.News;
import com.ground360.domain.Team;

public class TeamDaoImpl implements TeamDao {
	
	@Autowired private SessionFactory sessionFactory;
	
	public int addTeam(Team team)
	{
		this.sessionFactory.getCurrentSession().save(team);
		this.sessionFactory.getCurrentSession().flush();
		return team.getTid();
	}
	
	public boolean updateTeam(Team team)
	{
		try {
			this.sessionFactory.getCurrentSession().update(team);
			this.sessionFactory.getCurrentSession().flush();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Team getTeamByTid(int tid)
	{
		return (Team) this.sessionFactory.getCurrentSession().get(Team.class, tid);
	}
	
	@SuppressWarnings("unchecked")
	public List<Team> getTeamList()
	{
		return this.sessionFactory.getCurrentSession().createCriteria(News.class)
			.add(Restrictions.isNull("deleteDate"))
			.add(Restrictions.isNotNull("publishDate"))
			.addOrder(Order.asc("name"))
			.list();
	}
	



}
