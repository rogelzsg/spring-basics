package example09;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example09 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());

		try(
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example09/applicationContext.xml");
			) {
			
			// We will get the same hash
			System.out.println("Singleton comparison:");
			FooBean fooBean01 = context.getBean("fooBean_singleton", FooBean.class);
			fooBean01.test();
			FooBean fooBean02 = context.getBean("fooBean_singleton", FooBean.class);
			fooBean02.test();
			
			// We will get a different one
			System.out.println("Prototype comparison:");
			fooBean01 = context.getBean("fooBean_prototype", FooBean.class);
			fooBean01.test();
			fooBean02 = context.getBean("fooBean_prototype", FooBean.class);
			fooBean02.test();
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 

	}

}
