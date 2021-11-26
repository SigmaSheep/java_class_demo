package com.xinco.springdemo02a.config;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.xinco.springdemo02a")
@PropertySource("classpath:formcontent.properties")
public class DemoAppConfig {

		@Autowired
		private Environment env;
		
		@Bean
		public ViewResolver viewResolver() {
			InternalResourceViewResolver  viewResolver = 
					new InternalResourceViewResolver();
			
			viewResolver.setPrefix("/WEB-INF/view/");
			viewResolver.setSuffix(".jsp");
						
			return viewResolver;
		}
		
		@Bean
		@Qualifier("countries")
		public String[] countries() {
			return env.getProperty("countries", String[].class);
		}
		
}
