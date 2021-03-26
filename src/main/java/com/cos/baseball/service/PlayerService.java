package com.cos.baseball.service;

import org.springframework.stereotype.Service;

import com.cos.baseball.domain.PlayerRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PlayerService {

	private final PlayerRepository playerRepository;
}
