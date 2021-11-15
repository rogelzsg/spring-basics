package example08;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example08 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());
		
		/*
		 * We will obtain the following results:
		 * 1 - Before opening the context
		 * 2 - I have been started! (as soon as the context is open, the init method is triggered)
		 * 3 - After opening the context
		 * 4 - My property01 is started (test method)
		 * 5 - Before closing the context
		 * 6 - My property01 is started (test method; nothing has changed yet)
		 * 7 - I have been stopped! (when the context is closed, the destroy method works)
		 * 8 - After closing the context
		 * 9 - My property01 is stopped (the test method)
		 */
		
		
		FooBean fooBean = null;
		ClassPathXmlApplicationContext context = null;
		try {
			System.out.println("Before opening the context");
			
			context = new ClassPathXmlApplicationContext("example08/applicationContext.xml");
			
			System.out.println("After opening the context");
			
			fooBean = context.getBean(FooBean.class);
			fooBean.test();
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} finally {
			
			System.out.println("Before closing the context");
			fooBean.test();
			
			context.close();
			
			System.out.println("After closing the context");
			fooBean.test(); 
		}

	}

}
