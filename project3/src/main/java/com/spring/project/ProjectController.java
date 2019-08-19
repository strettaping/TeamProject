package com.spring.project;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.service.BuyerSvc;
import com.spring.service.SellerSvc;
import com.spring.vo.BuyerVO;
import com.spring.vo.SellerVO;

@Controller
@RequestMapping("/team1/*")
public class ProjectController {	
	
	// 로그 기록
	private static final Logger LOGGER = LoggerFactory.getLogger(ProjectController.class); 
	
	@Inject
	BuyerSvc bsvc;
	SellerSvc ssvc;
	//SellerSvc도 인젝트해야됨.
	
	
	@RequestMapping(value="")
	public String index() {
		return "/projteam1/order";
	}
	
		
	@RequestMapping(value = "/login")
	public String login() {
		return "/projteam1/login";
	}
	
	
	@RequestMapping(value = "/signin")
	public String signin() {
		return "/projteam1/signin";
	}
	
	
	@RequestMapping(value = "/sellersignin", method = RequestMethod.GET)
	public String sellerSignIn(SellerVO svo, Model model) {
		
		return "/projteam1/sellerSignIn";
	}
	
	@RequestMapping(value = "/sellersignin", method = RequestMethod.POST)
	public String sellerSignInPost(SellerVO svo, RedirectAttributes reAttr) throws Exception {
		
		reAttr.addFlashAttribute("Result", "Success");
		
		return "redirect:/team1/";
	}
	
	@RequestMapping(value = "/buyersignin", method = RequestMethod.GET)
	public void buyerSignIn(BuyerVO bvo, Model model) {
		
	}
	
	@RequestMapping(value = "/buyersignin", method = RequestMethod.POST)
	public String buyerSignInPost(BuyerVO bvo) {
		LOGGER.info(bvo.toString());
		
		bsvc.write(bvo);
		return "/projteam1/buyerSignInCheck";
	}
	
	// 정보 넘어가나 확인용
	@RequestMapping(value="/buyerSignInCheck")
	public void buyerSignInCheck(@RequestParam("Bid") String Bid, BuyerVO bvo) {
		bsvc.read(Bid);
	}
	
	
	
	@RequestMapping(value = "/{category}")
	public String categoryList(@PathVariable("category") String category) {
		return "/projteam1/category";
	}
	
	
}
