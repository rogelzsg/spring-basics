package example14.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import common.FooInterface;

@Component
public class FooBean implements FooInterface {
	
	@PostConstruct
	private void startLifeCycle() {
		System.out.println("I'm the PostConstruct-annotated method. I've been instantiated!");
	}
	
	@PreDestroy
	private void finishLifeCycle() {
		System.out.println("I'm the PreDestroy-annotated method. I've been destroyed");
	}

	@Override
	public void test() {
		

	}

}
