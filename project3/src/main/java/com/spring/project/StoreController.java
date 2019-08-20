package com.spring.project;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.StoreSvc;

@Controller
@RequestMapping("/team1/list/*")
public class StoreController {

	@Inject
	StoreSvc stsvc;
	
	@RequestMapping(value="/{category}")
	public String listOnePerson(Model model, @PathVariable("category") String category) {
		model.addAttribute("list", stsvc.listCategory(category));
		return "projteam1/category";
	}
}
