package com.xinco.springhw01;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyCarConfig.class);
		
		String carrier = context.getBean("carrierProperty", String.class);
		System.out.println(carrier);
		
		CarInterface toyota = context.getBean("toyota",CarInterface.class);
		System.out.println(toyota.startEngine());
		System.out.println(toyota.startAcclerate());

		CarInterface audi = context.getBean("audi",CarInterface.class);
		System.out.println(audi.startEngine());
		System.out.println(audi.startAcclerate());
		
		context.close();
	}
}
