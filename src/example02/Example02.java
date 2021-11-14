package example02;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example02 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());
		
		try (
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example02/applicationContext.xml");
		){
			
			/* In this example, we have two beans of a concrete class. 
			 * Using the following line will raise an exception:
			 * 	FooBean fooBean01 = context.getBean(FooBean.class);
			 * 
			 * Spring doesn't take the first bean or even try it, 
			 * it directly demands us to specify the bean!
			*/
			
			/* There are two beans completely different. Here we use 
			 * two ways of using the getBean method to obtain the same result*/
			FooBean fooBean01 = (FooBean) context.getBean("fooBean01");
			FooBean fooBean02 = context.getBean("fooBean02", FooBean.class);
			
			// Of course not; they are both singleton instances but from different beans
			System.out.println("Are fooBean01 and fooBean02 the same instance? " + (fooBean01 == fooBean02));
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 
		
	}

}
