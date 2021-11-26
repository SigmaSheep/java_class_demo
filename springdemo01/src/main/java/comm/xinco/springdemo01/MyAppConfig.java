package comm.xinco.springdemo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:carrier.properties")
public class MyAppConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	String carrierProperty() {
		return env.getProperty("carrier");
	}
	
	@Bean
	public TextService textService() {
		return new HappyTextService();
	}
			
	@Bean
	@Scope("singleton")
	public PhoneInterface iphoneX() {
		return new IphoneX(textService());
	}
	
	@Bean
	@Scope("prototype")
	public PhoneInterface samsung() {
		SamsungS7 phone = new SamsungS7();
		phone.setTextService(textService());
		return phone;
	}
	
}
