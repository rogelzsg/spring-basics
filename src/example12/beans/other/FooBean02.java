package example12.beans.other;

import org.springframework.stereotype.Component;

import common.FooInterface;

@Component("myUniqueID2")
public class FooBean02 implements FooInterface {

	@Override
	public void test() {
		System.out.println("I'm " + this.getClass().getSimpleName());
	}

}
