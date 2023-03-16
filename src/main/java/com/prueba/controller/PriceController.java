package com.prueba.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.Entity.dto.PriceRequestDto;
import com.prueba.Entity.dto.PriceResponseDto;
import com.prueba.servce.IPriceService;

@RestController
@RequestMapping("/api/price")
public class PriceController {

	@Autowired
	IPriceService priceService;
	
	@GetMapping
	public @ResponseBody Optional<PriceResponseDto> ver(PriceRequestDto priceRequestDto) {
		
		
		Optional<PriceResponseDto> priceRequest = priceService.findByStartDate(
				priceRequestDto.getStartDate(), 
				priceRequestDto.getProductId(),
				priceRequestDto.getBrandId()
				);
		
		return priceRequest;
		
	}
}
