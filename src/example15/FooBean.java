package example15;

import org.springframework.stereotype.Component;

import common.FooInterface;

@Component
public class FooBean implements FooInterface {

	@Override
	public void test() {
		System.out.println("It works!");
	}

}
