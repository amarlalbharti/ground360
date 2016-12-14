package com.ground360.service;

import java.util.List;

import com.ground360.domain.Team;

public interface TeamService {
	
	public int addTeam(Team team);
	
	public boolean updateTeam(Team team);
	
	public Team getTeamByTid(int tid);
	
	public List<Team> getTeamList();
	


}
