package example05;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example05 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());
		
		try (
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example05/applicationContext.xml");
		){
			
			FooBean fooBean = context.getBean(FooBean.class);
			fooBean.test();
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 
		
	}

}
