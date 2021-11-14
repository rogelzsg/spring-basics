package example03;

public class OneParamBean implements FooInterface {
	
	private String property01 = "original value01";
	
	public OneParamBean(String property01) {
		this.property01 = property01;
	}

	@Override
	public void test() {
		System.out.println("My property01 is the " + this.property01);
	}

}
