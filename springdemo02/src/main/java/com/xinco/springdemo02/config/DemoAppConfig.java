package com.xinco.springdemo02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.xinco.springdemo02")
public class DemoAppConfig {

		@Bean
		public ViewResolver viewResolver() {
			InternalResourceViewResolver  viewResol = 
					new InternalResourceViewResolver();
			
			return viewResol;
		}
}
