package example13.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import common.FooInterface;

// Don't forget about the @component annotation!
@Scope("prototype")
@Component
public class FooBeanPrototype implements FooInterface {

	@Override
	public void test() {
		
	}

}
