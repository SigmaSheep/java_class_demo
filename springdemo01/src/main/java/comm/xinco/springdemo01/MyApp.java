package comm.xinco.springdemo01;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
				
		// TODO Auto-generated method stub
		PhoneInterface iphoneX = context.getBean("iphoneX",PhoneInterface.class);
		System.out.println(iphoneX.getBuzz());
		System.out.println(iphoneX.greeting());
		
		PhoneInterface iphoneX2 = context.getBean("iphoneX",PhoneInterface.class);
		System.out.println(iphoneX2.getBuzz());
		System.out.println(iphoneX2.greeting());
		
		PhoneInterface samsung = context.getBean("samsung",PhoneInterface.class);
		System.out.println(samsung.getBuzz());
		System.out.println(samsung.greeting());
		
		PhoneInterface samsung2 = context.getBean("samsung",PhoneInterface.class);
		System.out.println(samsung2.getBuzz());
		System.out.println(samsung2.greeting());
		
		System.out.println("iphoneX " + (iphoneX == iphoneX2));
		System.out.println("iphoneX equal: " + (iphoneX.equals(iphoneX2)));
		System.out.println("samsung " + (samsung == samsung2));
		System.out.println("samsung equal: " + (samsung.equals(samsung2)));
				
		context.close();
	}

}
