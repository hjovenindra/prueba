package com.prueba.servce;

import java.time.LocalDateTime;
import java.util.Optional;
import com.prueba.Entity.dto.PriceResponseDto;

public interface IPriceService {
	
	public Optional<PriceResponseDto> findByStartDate(LocalDateTime startDate, Integer productoId, Long brandId );

}
