package com.cos.baseball.web;

import org.springframework.stereotype.Controller;

import com.cos.baseball.service.TeamService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TeamController {

	private final TeamService teamService;
}
