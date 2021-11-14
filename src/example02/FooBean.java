package example02;

import common.FooInterface;

public class FooBean implements FooInterface {

	@Override
	public void test() {
		System.out.println("I'm a " + this.getClass().getSimpleName() + " bean!");
	}

}
