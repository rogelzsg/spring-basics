package example06;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

public class FooBean implements FooInterface {
	
	private List<String> list;
	private Set<String> set;
	private Map<String,String> map;
	private Properties properties;
	
	public FooBean(List<String> list, Set<String> set, Map<String,String> map, Properties properties) {
		this.list = list;
		this.set = set;
		this.map = map;
		this.properties = properties;
	}

	@Override
	public void test() {
		System.out.println(String.join(", " ,this.list));
		System.out.println(String.join(", " ,this.set));
		System.out.println( stringifyEntrySet(this.map.entrySet()) );
		System.out.println( stringifyEntrySet(this.properties.entrySet()) );
	}
	
	private <T> String stringifyEntrySet(Set<Entry<T,T>> entries) {
		List<String> stringifiedEntries = entries.stream().map( (entry) -> "[" + entry.getKey() + ": " + entry.getValue() + "]" ).collect(Collectors.toList());
		return String.join(", ", stringifiedEntries);
	}

}
