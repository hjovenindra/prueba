package com.prueba.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.prueba.Entity.Price;
import com.prueba.Entity.dto.PriceResponseDto;

public interface PriceRepository extends CrudRepository<Price, Long> {
	
	
	@Query(value = "SELECT BRAND_ID AS brandId, PRICE_LIST AS priceList, PRICE AS price, "
			+ " START_DATE AS startDate, PRODUCT_ID AS productId FROM PRICES WHERE START_DATE >= ?1 AND END_DATE >= ?1 "
			+ " AND PRODUCT_ID=?2 AND BRAND_ID=?3 ORDER BY PRIORITY, END_DATE DESC LIMIT 1 ", 
			   nativeQuery = true)
	Optional<PriceResponseDto> findByStartDate(LocalDateTime startDate, Integer productoId, Long brandId);
}
