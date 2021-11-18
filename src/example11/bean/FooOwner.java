package example11.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import common.FooInterface;
import example11.bean.other.FooBean01;
import example11.bean.other.FooBean02;
import example11.bean.other.FooBean03;

@Component
public class FooOwner implements FooInterface {
	
	private FooBean01 bean01;
	
	private FooBean02 bean02;
	
	private FooBean03 bean03;
	
	@Autowired // constructor
	public FooOwner(FooBean01 bean01) {
		this.bean01 = bean01;
	}
	
	@Autowired // setter
	public void setFooBean02(FooBean02 bean02) {
		this.bean02 = bean02;
	}
	
	@Autowired // customMethod (not called by us, but automatically at being instantiated)
	public int randomMethod(FooBean03 bean03) {
		this.bean03 = bean03;
		// some stuff
		return 0;
	}

	@Override
	public void test() {
		System.out.println(bean01.toString());
		System.out.println(bean02.toString());
		System.out.println(bean03.toString());
	}

}
