package example14;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.FooInterface;
import example14.beans.FooBean;


public class Example14 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());
		
		/* The output results:
		 * 
		 * Before executing
		 * I'm the PostConstruct-annotated method. I've been instantiated!
		 * Before getting the bean
		 * After getting the bean
		 * Before closing the context
		 * I'm the PreDestroy-annotated method. I've been destroyed
		 * After having closed the context
		 * 
		 * There is no error on the second and third lines.
		 * The bean is automatically instantiated when the context is created,
		 * regardless of whether we use it later to get the bean reference.
		 * It's just already created.
		 */

		System.out.println("Before executing");
		try(
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example14/applicationContext.xml");
			) {
			System.out.println("Before getting the bean");
			FooInterface bean01 = context.getBean(FooBean.class);
			System.out.println("After getting the bean");
			System.out.println("Before closing the context");
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 
		System.out.println("After having closed the context");
	}

}
