package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.RestMessageException;
import com.example.demo.Repository.DealRepository;
import com.example.demo.model.Deal;

@Service
public class DealService {

	@Autowired
	private DealRepository dealRepository;
	
	public Deal createDeal(Deal deal) throws RestMessageException {
		if(dealRepository.existsByFromCurrencyAndToCurrency(deal.getFromCurrency(), deal.getToCurrency())) {
			throw new RestMessageException("Data already exists");
		}
		deal.setFromCurrency(deal.getFromCurrency());
		deal.setToCurrency(deal.getToCurrency());
		deal.setAmount(deal.getAmount());
		deal.setDateTime(deal.getDateTime());
		return dealRepository.save(deal);
	}
}
