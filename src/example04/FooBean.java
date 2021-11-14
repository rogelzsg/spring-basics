package example04;

import common.FooInterface;

public class FooBean implements FooInterface {
	
	private String property01 = "original value01";
	private String property02 = "original value02";
	private Integer property03;
	
	// We allow a constructor injection to check in which order the properties are modified
	public FooBean(Integer property03) {
		this.property03 = property03;
	}
	
	// The setters will follow to the constructor injection
	public void setProperty01(String property01) {
		this.property01 = property01;
	}
	public void setProperty02(String property02) {
		this.property02 = property02;
	}
	public void setProperty03(Integer property03) {
		this.property03 = property03;
	}

	@Override
	public void test() {
		System.out.println("My property01 is the " + this.property01
				+ ", my property02 is the " + this.property02
				+ ", my property03 is " + this.property03);
	}

}
