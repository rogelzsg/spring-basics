package example01;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example01 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());
		
		try (
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example01/applicationContext.xml");
		){
			
			// The simplest implementation: an empty instance 
			FooBean fooBean01 = context.getBean(FooBean.class);
			fooBean01.test();		
			/* This works because there is only ONE bean of this class defined in the xml; if we had two or more,
			a qualifying exception will be raised (Spring doesn't know which one to choose) */
			
			// In case we use an id, the method retrieves a generic Object. A casting is needed
			FooBean fooBean02 = (FooBean) context.getBean("fooBean");
			
			// Yes, they are. The default scope is singleton, but it can be changed manually to prototype
			System.out.println("Are fooBean01 and fooBean02 the same instance? " + (fooBean01 == fooBean02));
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 
		
	}

}
