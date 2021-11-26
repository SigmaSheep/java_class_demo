package comm.xinco.springdemo01;

public class IphoneX implements PhoneInterface {

	private TextService textService;
		
	public IphoneX(TextService textService) {
		this.textService = textService;
	}

	@Override
	public String getBuzz() {
		
		return "Buzz from iphoneX";
	}

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return "Greeting from IphoneX - " + textService.getText();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof IphoneX) {
			IphoneX other = (IphoneX) obj;
			return this.textService == other.textService;
		}
		return false;
	}
	
}
