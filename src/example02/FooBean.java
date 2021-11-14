package example02;

public class FooBean implements FooInterface {

	@Override
	public void test() {
		System.out.println("I'm a " + this.getClass().getSimpleName() + " bean!");
	}

}
