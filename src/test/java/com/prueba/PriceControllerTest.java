package com.prueba;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import com.prueba.Entity.Price;

@SpringBootTest(webEnvironment =WebEnvironment.RANDOM_PORT)
public class PriceControllerTest {
	
	@Value(value="${local.server.port}")
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void test1() throws Exception {
		var price = this.restTemplate.getForObject("http://localhost:" + port + "/api/price?startDate=2020-06-14 10:00:00&productId=35455&brandId=1",
				Price.class);
		
		assertThat(price).isNotNull();
	}
	
	@Test
	public void test2() throws Exception {
		var price = this.restTemplate.getForObject("http://localhost:" + port + "/api/price?startDate=2020-06-14 16:00:00&productId=35455&brandId=1",
				Price.class);
		
		assertThat(price).isNotNull();
	}
	
	@Test
	public void test3() throws Exception {
		var price = this.restTemplate.getForObject("http://localhost:" + port + "/api/price?startDate=2020-06-14 21:00:00&productId=35455&brandId=1",
				Price.class);
		
		assertThat(price).isNotNull();
	}
	
	@Test
	public void test4() throws Exception {
		var price = this.restTemplate.getForObject("http://localhost:" + port + "/api/price?startDate=2020-06-10 15:00:00&productId=35455&brandId=1",
				Price.class);
		
		assertThat(price).isNotNull();
	}
	
	@Test
	public void test5() throws Exception {
		var price = this.restTemplate.getForObject("http://localhost:" + port + "/api/price?startDate=2020-06-16 21:00:00&productId=35455&brandId=1",
				Price.class);
		
		assertThat(price).isNotNull();
	}

}
