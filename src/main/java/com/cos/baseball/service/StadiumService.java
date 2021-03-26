package com.cos.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.baseball.domain.PlayerRepository;
import com.cos.baseball.domain.Stadium;
import com.cos.baseball.domain.StadiumRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StadiumService {

	private final StadiumRepository stadiumRepository;
	
	@Transactional
	public void 야구장등록(Stadium stadium) {
		stadiumRepository.save(stadium);
	}
	
	@Transactional(readOnly = true)
	public List<Stadium> 야구장리스트(){
		return stadiumRepository.findAll();
	}
}
