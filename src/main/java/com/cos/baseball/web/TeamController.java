package com.cos.baseball.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.baseball.domain.Stadium;
import com.cos.baseball.domain.Team;
import com.cos.baseball.service.StadiumService;
import com.cos.baseball.service.TeamService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TeamController {

	private final TeamService teamService;
	private final StadiumService stadiumService;
	
	@GetMapping("/team/saveForm")
	public String saveForm(Model model) {
		List<Stadium> stadiums = stadiumService.야구장리스트();
		model.addAttribute("stadiums", stadiums);
		return "team/saveForm";
	}
	
	@PostMapping("/team/save")
	public String save(Team team) {
		teamService.팀등록(team);
		return "redirect:/team/list";
	}
	
	@GetMapping("/team/list")
	public String list(Model model) {
		List<Team> teams = teamService.팀리스트();
		model.addAttribute("teams", teams);
		return "/team/list";
	}
}
