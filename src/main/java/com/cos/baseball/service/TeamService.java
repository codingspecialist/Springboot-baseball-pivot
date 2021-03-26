package com.cos.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.baseball.domain.Stadium;
import com.cos.baseball.domain.StadiumRepository;
import com.cos.baseball.domain.Team;
import com.cos.baseball.domain.TeamRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TeamService {

	private final TeamRepository teamRepository;
	private final StadiumRepository stadiumRepository;
	
	@Transactional
	public void 팀등록(Team team) {
		Stadium stadiumEntity = stadiumRepository.findById(team.getStadiumId()).get();
		team.setStadium(stadiumEntity);
		teamRepository.save(team);
	}
	
	@Transactional(readOnly = true)
	public List<Team> 팀리스트(){
		return teamRepository.findAll();
	}
}
