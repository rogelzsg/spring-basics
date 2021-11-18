package example12;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import example12.beans.FooOwnerBean;


public class Example12 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());

		try(
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example12/applicationContext.xml");
			) {
			
			context.getBean(FooOwnerBean.class).test();
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 

	}

}
