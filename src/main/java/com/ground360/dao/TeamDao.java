package com.ground360.dao;

import java.util.List;

import com.ground360.domain.Team;

public interface TeamDao {
	
	public int addTeam(Team team);
	
	public boolean updateTeam(Team team);
	
	public Team getTeamByTid(int tid);
	
	public List<Team> getTeamList();
	

}
