package com.xinco.springhw01;

public class Audi implements CarInterface{
	
	private ShiftGear shiftGear;
	
	public void setShiftGear(ShiftGear shiftGear) {
		this.shiftGear = shiftGear;
	}

	@Override
	public String startEngine() {
		return "Audi start engine";
	}

	@Override
	public String startAcclerate() {
		return "Audi start accelerate -- " + shiftGear.gearUp();
	}
}
