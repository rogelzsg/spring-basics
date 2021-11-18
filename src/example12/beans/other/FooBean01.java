package example12.beans.other;

import org.springframework.stereotype.Component;

import common.FooInterface;

@Component("myUniqueID1")
public class FooBean01 implements FooInterface {

	@Override
	public void test() {
		System.out.println("I'm " + this.getClass().getSimpleName());
	}

}
