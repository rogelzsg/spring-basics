package example11.bean.other;

import org.springframework.stereotype.Component;

@Component
public class FooBean03 {

	@Override
	public String toString() {
		return "I'm " + this.getClass().getSimpleName() + ", injected through the custom method";
	}

}
