package example15;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import common.FooInterface;


public class Example15 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());
		
		/* 
		 * The config class is literally empty
		 */
		
		try(
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			) {

			FooInterface bean = context.getBean(FooBean.class);
			bean.test();
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 
		
	}

}
