package comm.xinco.springdemo01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyAppConfig {
	
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
