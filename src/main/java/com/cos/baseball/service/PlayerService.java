package com.cos.baseball.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.qlrm.mapper.JpaResultMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.baseball.domain.Player;
import com.cos.baseball.domain.PlayerRepository;
import com.cos.baseball.domain.Team;
import com.cos.baseball.domain.TeamRepository;
import com.cos.baseball.web.dto.PlayerPositionRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PlayerService {

	private final PlayerRepository playerRepository;
	private final TeamRepository teamRepository;
	private final EntityManager entityManager;
	
	@Transactional
	public void 선수등록(Player player) {
		Team teamEntity = teamRepository.findById(player.getTeamId()).get();
		player.setTeam(teamEntity);
		playerRepository.save(player);
	}
	
	@Transactional(readOnly = true)
	public List<Player> 선수리스트(){
		return playerRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public List<PlayerPositionRespDto> 포지션별선수리스트(){
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT ");
		sb.append("position, ");
		sb.append("MAX(if(teamId = 1, name, \"\")) LG, ");
		sb.append("MAX(if(teamId = 2, name, \"\")) LOTTE, ");
		sb.append("MAX(if(teamId = 3, name, \"\")) SAMSUNG ");
		sb.append("from player ");
		sb.append("GROUP BY position ");
		Query q = entityManager.createNativeQuery(sb.toString());
		JpaResultMapper result = new JpaResultMapper();
		List<PlayerPositionRespDto> playerPositionRespDto = result.list(q, PlayerPositionRespDto.class);
		return playerPositionRespDto;
	}
	
}
