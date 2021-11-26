package com.xinco.springhw01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:carrier.properties")
public class MyCarConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	String carrierProperty() {
		return env.getProperty("carrier");
	}
	
	@Bean
	public ShiftGear shiftGear() {
		return new StartShiftGear();
	}
	
	@Bean
	public CarInterface toyota() {
		return new Toyota(shiftGear());
	}
	
	@Bean
	public CarInterface audi() {
		Audi audi = new Audi();
		audi.setShiftGear(shiftGear());
		return audi;
	}
	
	
	
}
