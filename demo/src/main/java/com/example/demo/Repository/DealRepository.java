package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Deal;

public interface DealRepository extends JpaRepository<Deal, Long>{

	boolean existsByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency);
}
