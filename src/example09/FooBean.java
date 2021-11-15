package example09;

import common.FooInterface;

public class FooBean implements FooInterface {

	@Override
	public void test() {
		System.out.println("My hash is " + this.hashCode());
	}

}
