package com.cos.baseball.service;

import org.springframework.stereotype.Service;

import com.cos.baseball.domain.PlayerRepository;
import com.cos.baseball.domain.StadiumRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StadiumService {

	private final StadiumRepository stadiumRepository;
}
