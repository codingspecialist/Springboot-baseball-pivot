package com.cos.baseball.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.baseball.domain.Player;
import com.cos.baseball.domain.Team;
import com.cos.baseball.service.PlayerService;
import com.cos.baseball.service.TeamService;
import com.cos.baseball.web.dto.PlayerPositionRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class PlayerController {

	private final PlayerService playerService;
	private final TeamService teamService;
	
	@GetMapping("/player/saveForm")
	public String saveForm(Model model) {
		
		List<Team> teams = teamService.팀리스트();
		model.addAttribute("teams", teams);
		return "player/saveForm";
	}
	
	@PostMapping("/player/save")
	public String save(Player player) {
		playerService.선수등록(player);
		return "redirect:/player/list";
	}
	
	@GetMapping("/player/list")
	public String list(Model model) {
		List<Player> players = playerService.선수리스트();
		model.addAttribute("players", players);
		return "player/list";
	}
	
	@GetMapping("/player/positionList")
	public String positionList(Model model) {
		List<PlayerPositionRespDto> dtos = playerService.포지션별선수리스트();
		model.addAttribute("dtos", dtos);
		return "player/positionList";
	}
}
