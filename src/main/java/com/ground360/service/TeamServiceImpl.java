package com.ground360.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ground360.domain.Team;

public class TeamServiceImpl implements TeamService{
	@Autowired private TeamService teamService;
	public int addTeam(Team team)
	{
		return this.teamService.addTeam(team);
	}
	
	public boolean updateTeam(Team team)
	{
		return this.teamService.updateTeam(team);
	}
	
	public Team getTeamByTid(int tid)
	{
		return this.teamService.getTeamByTid(tid);
	}
	
	public List<Team> getTeamList()
	{
		return this.teamService.getTeamList();
	}
	



}
