package example13;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import example13.beans.FooBeanPrototype;
import example13.beans.FooBeanSingleton;


public class Example13 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());

		try(
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example13/applicationContext.xml");
			) {
			
			FooBeanPrototype bean01 = context.getBean(FooBeanPrototype.class);
			FooBeanPrototype bean02 = context.getBean(FooBeanPrototype.class);
			System.out.println("They have differentes hashes: " + bean01.hashCode() + " and " + bean02.hashCode());
			
			FooBeanSingleton bean03 = context.getBean(FooBeanSingleton.class);
			FooBeanSingleton bean04 = context.getBean(FooBeanSingleton.class);
			System.out.println("They have same hash: " + bean03.hashCode() + " and " + bean04.hashCode());
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 

	}

}
