package com.example.demo.Controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.RestMessageException;
import com.example.demo.Message.RestMessage;
import com.example.demo.Message.Error.RestErrorMessage;
import com.example.demo.Message.Success.RestSuccessMessage;
import com.example.demo.Service.DealService;
import com.example.demo.model.Deal;

@RestController
@RequestMapping("/master/")
public class DealController {

	@Autowired
	private DealService dealService;
	
	 @PostMapping("/deal")
	    public RestMessage createInitialUser(@Valid @RequestBody Deal deal, Locale locale) throws RestMessageException
	    {
		 if(dealService.createDeal(deal)!=null) {
	            String successMessage = "Deal Successfully addded";
	            return new RestSuccessMessage(successMessage);
	        }
	        else
	        {
	            return new RestErrorMessage("Internal Server Error");
	        }
	    }
}
