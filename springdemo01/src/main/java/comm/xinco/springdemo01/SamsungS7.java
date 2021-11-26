package comm.xinco.springdemo01;

public class SamsungS7 implements PhoneInterface {

	private TextService textService;

	public void setTextService(TextService textService) {
		this.textService = textService;
	}

	@Override
	public String getBuzz() {
		return "Buzz from Samsung";
	}

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return "Greeting from Samsung - " + textService.getText();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof SamsungS7) {
			SamsungS7 other = (SamsungS7) obj;
			return this.textService == other.textService;
		}
		return false;
	}
	
}
