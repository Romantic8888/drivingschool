package com.df.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Main")
public class Main {
	
	@RequestMapping("/todata")
	public String tologin(){
		return "redirect:/Student/tolist.do";
	}
}
