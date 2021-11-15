package example08;

import common.FooInterface;

public class FooBean implements FooInterface {
	
	private String property01;
	
	public void startMe() {
		System.out.println("I have been started!");
		this.property01 = "started";
	}
	
	private String stopMe() {
		System.out.println("I have been stopped!");
		this.property01 = "stopped";
		return "this.property01";
	}

	@Override
	public void test() {
		System.out.println("My property01 is " + this.property01);
	}

}
