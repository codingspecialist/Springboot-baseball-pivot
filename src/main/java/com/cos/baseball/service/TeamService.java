package com.cos.baseball.service;

import org.springframework.stereotype.Service;

import com.cos.baseball.domain.PlayerRepository;
import com.cos.baseball.domain.TeamRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TeamService {

	private final TeamRepository teamRepository;
}
