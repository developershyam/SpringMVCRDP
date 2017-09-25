package com.cognizant.bookmyseat.controller;

import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.bookmyseat.login.vo.UserDetailsVO;

@Controller
public class LoginController {
	
	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping("/loginPage")
	public ModelAndView goToLogin(){
		ModelAndView model = new ModelAndView();
		model.getModelMap().addAttribute("userDetailsVO", new UserDetailsVO());
		model.setViewName("login");
		
		return model;
	}
	
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public ModelAndView submitLogin(@ModelAttribute("userDetailsVO") UserDetailsVO user,Locale locale, HttpServletRequest request,
            HttpServletResponse response){
		ModelAndView mav = new ModelAndView();
		
		if(user != null && StringUtils.hasText(user.getUserName()) && 
				StringUtils.hasText(user.getPassword()) && (user.getUserName().equals(user.getPassword()))){
			mav.addObject("userName", user.getUserName());
			mav.setViewName("home");
			Cookie newCookie = new Cookie("userName", user.getUserName());
	        newCookie.setMaxAge(24 * 60 * 60);
	        response.addCookie(newCookie);
			
			
		}else{
			mav.addObject("errorMessage", messageSource.getMessage("login.error", null, locale ));
			mav.setViewName("login");
		}
		return mav;
	}

}
