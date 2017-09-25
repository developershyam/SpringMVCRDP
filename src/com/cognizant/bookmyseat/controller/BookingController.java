package com.cognizant.bookmyseat.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.bookmyseat.ticket.vo.PassengerDetailsVO;
import com.cognizant.bookmyseat.validator.PassengerDetailsValidator;

@Controller
public class BookingController {

	@Autowired
	private PassengerDetailsValidator validator;
	
	@RequestMapping("/bookTickets")
	public ModelAndView bookTicket(@CookieValue(value = "userName",defaultValue = "defaultCookieValue") String userName){
		ModelAndView model = new ModelAndView();
		model.getModelMap().addAttribute("passengerDetailsVO", new PassengerDetailsVO());
		model.addObject("userName", userName);
		model.setViewName("bookTicket");
		return model;
	}
	
	@RequestMapping(value="/bookTicketOnline", method=RequestMethod.POST)
	public ModelAndView submitBook(PassengerDetailsVO pass, BindingResult result, @CookieValue(value = "userName",defaultValue = "defaultCookieValue") String userName){
		ModelAndView model = new ModelAndView();
		validator.validate(pass, result);
		model.addObject(pass);
		model.addObject("userName", userName);
		model.setViewName("bookSuccess");
		if(result.hasErrors()){
			model.setViewName("bookTicket");
		}
		return model;
	}
	
	@ModelAttribute("cityList")
	public Map<String, String> getCities(){
		Map<String, String> map = new HashMap<>();
		map.put("Bengaluru", "Bengaluru");
		map.put("Chennai", "Chennai");
		map.put("Mumbai", "Mumbai");
		
		return map;
	}
	
	@ModelAttribute("genderList")
	public Map<String, String> getGenders(){
		Map<String, String> map = new HashMap<>();
		map.put("Male", "Male");
		map.put("Female", "Female");
		
		return map;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

}
