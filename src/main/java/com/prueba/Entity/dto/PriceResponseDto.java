package com.prueba.Entity.dto;

import java.time.LocalDateTime;

public interface PriceResponseDto {
	
	Integer getProductId();
	Integer getBrandId();
	Integer getPriceList();
	LocalDateTime getStartDate();
	Double getPrice();
}
