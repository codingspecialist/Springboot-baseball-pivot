package com.cos.baseball.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.baseball.domain.Stadium;
import com.cos.baseball.service.StadiumService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class StadiumController {

	private final StadiumService stadiumService;
	
	@GetMapping({"/", "/stadium/saveForm"})
	public String saveForm() {
		return "stadium/saveForm";
	}
	
	@PostMapping("/stadium/save")
	public String save(Stadium stadium) {
		stadiumService.야구장등록(stadium);
		
		return "redirect:/stadium/list";
	}
	
	@GetMapping("/stadium/list")
	public String list(Model model) {
		List<Stadium> stadiums = stadiumService.야구장리스트();
		model.addAttribute("stadiums", stadiums);
		return "/stadium/list";
	}
}
