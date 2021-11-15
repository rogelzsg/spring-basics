package example07;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example07 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());
		
		try (
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example07/applicationContext.xml");
		){
			
			FooBean fooBean = context.getBean(FooBean.class);
			fooBean.test();
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 
		
	}

}
