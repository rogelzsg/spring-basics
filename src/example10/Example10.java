package example10;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import example10.beans.FooBean;

public class Example10 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());

		try(
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example10/applicationContext.xml");
			) {
			
			// This bean is not defined in the XML
			FooBean fooBean = context.getBean(FooBean.class);
			fooBean.test();
			
			// The annotation @Component does not require a custom id, 
			// but we can use it to avoid an ambiguous injection.
			fooBean = context.getBean("myCustomFooBean", FooBean.class);
			fooBean.test();
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 

	}

}
