package example12.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import common.FooInterface;

@Component
public class FooOwnerBean implements FooInterface {
	
	@Autowired
	@Qualifier("myUniqueID1")
	private FooInterface bean01;
	
	@Autowired
	@Qualifier("myUniqueID2")
	private FooInterface bean02;

	@Override
	public void test() {
		bean01.test();
		bean02.test();
	}

}
