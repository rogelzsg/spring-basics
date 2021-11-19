import example01.Example01;
import example02.Example02;
import example03.Example03;
import example04.Example04;
import example05.Example05;
import example06.Example06;
import example07.Example07;
import example08.Example08;
import example09.Example09;
import example10.Example10;
import example11.Example11;
import example12.Example12;
import example13.Example13;
import example14.Example14;
import example15.Example15;

public class Main {

	public static void main(String[] args) {
		
	
		/***** XML Context *****/
		
		// Simple instantiation: one bean of a class
		// new Example01().test();
		
		// Simple instantiation with qualifying problems: two beans of the same class
		// new Example02().test();
		
		// Constructor injection: with one and multiple params; with value, ref and nested beans
		// new Example03().test();
		
		// Setter injection: it works exactly the same way a constructor injection does, but after it
		// new Example04().test();
		
		// Injection of collections, by nesting them
		// new Example05().test();
		
		// Injection of collections, by referring them (requires an extra Spring XML Schema)
		// new Example06().test();
		
		// Usage of a properties file, first by getting its values separately, second as a whole entity
		// new Example07().test();
		
		// init and destroy methods
		// new Example08().test();
		
		// Singleton anexample10d Prototype scopes
		// new Example09().test();
		
		
		/***** XML Context + scanned Annotations *****/
		
		// A single bean not defined in the XML, got by scanning its folder recursively
		// new Example10().test();
		
		// Autowired through a constructor, a setter and a custom method
		// new Example11().test();
	
		// Two autowired properties of a same class, differenced thanks to their qualifiers
		// new Example12().test();
		
		// Scopes (Singleton and Prototype) with an annotation
		// new Example13().test();
		
		// PreDestroy and PostConstruct (requires javax.annotation lib for Java 9+)
		// new Example14().test();
		
		
		/***** Config class + scanned Annotations *****/
		
		// Usage of plain class as the context
		// new Example15().test();
		
	}

}
