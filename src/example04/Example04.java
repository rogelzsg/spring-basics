package example04;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example04 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());
		
		try (
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example04/applicationContext.xml");
		){
			
			/* The setters are automatically called after the constructor. The property03 is updated */
			FooBean fooBean = context.getBean(FooBean.class);
			fooBean.test();
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 
		
	}

}
