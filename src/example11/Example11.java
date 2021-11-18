package example11;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import example11.bean.FooOwner;

public class Example11 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());

		try(
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example11/applicationContext.xml");
			) {
			
			context.getBean(FooOwner.class).test();

		} catch (Exception e) {
			log.severe(e.getMessage());
		} 

	}

}
