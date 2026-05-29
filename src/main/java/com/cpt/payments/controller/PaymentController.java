package com.cpt.payments.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpt.payments.constant.EndPoints;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(EndPoints.V1_PAYMENTS)
@Slf4j
public class PaymentController {
	
	
	
	@PostMapping
	public String createPayment() {
		
		
		log.info("Creating Payment");
		
		return "Payment Created";
		
	}

}
