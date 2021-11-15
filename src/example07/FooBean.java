package example07;

import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import common.FooInterface;

public class FooBean implements FooInterface {
	
	private String property01;
	private String property02;
	private List<String> property03;
	private Properties property04;
	
	public FooBean(String property01, String property02, List<String> property03, Properties property04) {
		this.property01 = property01;
		this.property02 = property02;
		this.property03 = property03;
		this.property04 = property04;
	}

	@Override
	public void test() {
		System.out.println("The protocol " + this.property01 + " uses the port " + this.property02);
		System.out.println(String.join(", ", this.property03));
		
		List<String> list = property04.entrySet().stream().map(entry->"(" + entry.getKey() + ":" + entry.getValue() + ")").collect(Collectors.toList());
		System.out.println(String.join(", ", list));
	}
	

}
