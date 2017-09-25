package com.cognizant.bookmyseat.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cognizant.bookmyseat.ticket.vo.PassengerDetailsVO;

@Component
public class PassengerDetailsValidator implements Validator{

	private Pattern pattern;  
	private Matcher matcher;  

	String STRING_PATTERN = "[a-zA-Z]+";  
	String MOBILE_PATTERN = "[0-9]{10}";  

	@Autowired
	private MessageSource messageSource;

	@Override
	public boolean supports(Class commandClass) {
		return PassengerDetailsVO.class.isAssignableFrom(commandClass);
	}

	@Override
	public void validate(Object commandObject, Errors errors) {
		PassengerDetailsVO passengerDetailsVO = (PassengerDetailsVO) commandObject;

		System.out.println("******validation call**********");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.name");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "error.phone");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "source", "error.from");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "destination", "error.to");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "error.gender");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cardNumber", "error.card");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doj", "error.date");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pinNumber", "error.card.pin");

		// checkbox validation   
		if (!passengerDetailsVO.isAgreed()) {  
			errors.rejectValue("agreed", "error.agree", "");  
		}
		
		/*pattern = Pattern.compile(MOBILE_PATTERN);  
		matcher = pattern.matcher(Long.toString(passengerDetailsVO.getPhoneNumber()));  
		if (!matcher.matches()) {  
			errors.rejectValue("phoneNumber", "error.phone", "");  
		   }*/  

	}
}
