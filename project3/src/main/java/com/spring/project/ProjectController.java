package com.spring.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team1/*")
public class ProjectController {
	
	@RequestMapping(value = "")
	public String main() {
		return "/projteam1/main";
	}
	
	
	@RequestMapping(value = "/login")
	public String login() {
		return "/projteam1/login";
	}
	
	
	@RequestMapping(value = "/signin")
	public String signin() {
		return "/projteam1/signin";
	}
	
	@RequestMapping(value = "/sellersingin")
	public String sellerSignIn() {
		return "/projteam1/sellerSignIn";
	}
	
	@RequestMapping(value = "/buyersignin")
	public String buyerSignIn() {
		return "/projteam1/buyerSignIn";
	}
}
