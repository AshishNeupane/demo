package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Table(name = "deals")
@Data
public class Deal {

    @Column(unique = true)
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    @JsonProperty("from_currency")
    @NotNull(message ="From currency is required")
    private String fromCurrency;

    @JsonProperty("to_currency")
    @NotNull(message ="To currency is required")
    private String toCurrency;

    @JsonProperty("date_time")
    @NotNull(message ="DateTime is required")
    private String dateTime;

    @JsonProperty("amount")
    @NotNull(message ="Amount is required")
    private Float amount;
    
}
