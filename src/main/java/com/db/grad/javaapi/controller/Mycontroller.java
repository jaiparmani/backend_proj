/**
 * 
 */
package com.db.grad.javaapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.model.trade;
import com.db.grad.javaapi.repository.SecurityRepository;
import com.db.grad.javaapi.repository.TradeRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * @author Dell
 *
 */
@RestController
@RequestMapping("/api/v1")
public class Mycontroller {
	
	@Autowired
	private SecurityRepository  securityRepository;
	@Autowired
	private TradeRepository tradeRepository;
	
	@GetMapping("/trade")
	public List<trade> gettrade() {
		
		return tradeRepository.findAll();
	}
	
	@PostMapping("/trade")
	public trade createtrade(@Valid @RequestBody trade Trade) {
		
		return tradeRepository.saveAndFlush(Trade);
	}
	
}
