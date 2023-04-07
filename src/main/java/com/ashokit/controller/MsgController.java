package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/Welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "HEYY , Welcome to ashokit ....");
		mav.setViewName("Msg");
		return mav;

	}

	@GetMapping("/Greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "HEYY , Good Night ....");
		mav.setViewName("Msg");
		return mav;

	}
}
