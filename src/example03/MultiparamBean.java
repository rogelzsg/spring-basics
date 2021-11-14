package example03;

public class MultiparamBean implements FooInterface {
	
	private String property01 = "original value 1";
	private Integer property02 = -1;
	private String property03 = "original value 3";

	private String property04 = "original value 4";
	
	// This constructor will be invoked by Spring and injected with all its dependencies
	public MultiparamBean(String property01, Integer property02, String property03) {
		this.property01 = property01;
		this.property02 = property02;
		this.property03 = property03;
	}
	
	/* This constructor will be ignored by Spring because its params (the number of them
	and their class types) and those defined in the XML don't match */
	public MultiparamBean(String property01, Integer property02, String property03, String property04) {
		this.property01 = property01;
		this.property02 = property02;
		this.property03 = property03;
		this.property04 = property04;
	}

	@Override
	public void test() {
		System.out.println("My property01 is " + this.property01 
				+ ", and my property02 is " + this.property02 
				+ ", and my property03 is " + this.property03
				+ ", and my property04 is " + this.property04);
	}

}
