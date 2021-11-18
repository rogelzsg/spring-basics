package example10.beans;

import org.springframework.stereotype.Component;

import common.FooInterface;

/* If we do not provide a param, the id will be set as the class name
 * in lowerCamelCase: fooBean */
@Component("myCustomFooBean")
public class FooBean implements FooInterface {

	@Override
	public void test() {
		System.out.println("I'm not in the XML definition!");
	}

}
