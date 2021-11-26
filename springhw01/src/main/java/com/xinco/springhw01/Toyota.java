package com.xinco.springhw01;

public class Toyota implements CarInterface{
	
	private ShiftGear shiftGear;
	
	public Toyota(ShiftGear shiftGear) {
		this.shiftGear = shiftGear;
	}

	@Override
	public String startEngine() {
		return "Toyota start engine";
	}

	@Override
	public String startAcclerate() {
		return "Toyota start acclerate -- " + shiftGear.gearUp();
	}
	
}
