package com.cos.baseball.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
