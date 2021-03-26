package com.cos.baseball.web;

import org.springframework.stereotype.Controller;

import com.cos.baseball.service.PlayerService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class PlayerController {

	private final PlayerService playerService;
}
