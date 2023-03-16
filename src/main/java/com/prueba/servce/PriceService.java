package com.prueba.servce;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.Entity.Price;
import com.prueba.Entity.dto.PriceResponseDto;
import com.prueba.repository.PriceRepository;

@Service
public class PriceService implements IPriceService {
	
	@Autowired
	PriceRepository priceRepository;

	@Override
	public Optional<PriceResponseDto> findByStartDate(LocalDateTime startDate, Integer productoId, Long brandId) {

		
		return priceRepository.findByStartDate(startDate, productoId, brandId);
	}


}
