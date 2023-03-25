package com.example.demo.TestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Deal;

@RestController
public class TestController {

	@RequestMapping(value = "/deals", method = RequestMethod.GET)
	public Deal firstPage() {

		Deal deal = new Deal();
		deal.setId(1L);
		deal.setFromCurrency("ISO-123");
		deal.setToCurrency("Iso-445");
		deal.setAmount(2000F);
		deal.setDateTime("2022-01-01");
		return deal;
	}

}