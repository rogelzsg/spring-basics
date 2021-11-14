package example03;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example03 {
	
	public void test() {
		
		Logger log = Logger.getLogger(this.getClass().getSimpleName());
		
		try (
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example03/applicationContext.xml");
		){
			
			/* The injection overrides the original value ('original value'), so we
			get 'injected value' here */
			OneParamBean oneParamBean = context.getBean(OneParamBean.class);
			oneParamBean.test();
			
			// The second example uses multiple params
			MultiparamBean multiparamBean = context.getBean(MultiparamBean.class);
			multiparamBean.test();
			
		} catch (Exception e) {
			log.severe(e.getMessage());
		} 
		
	}

}
