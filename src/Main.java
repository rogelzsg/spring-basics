import example01.Example01;
import example02.Example02;
import example03.Example03;
import example04.Example04;
import example05.Example05;
import example06.Example06;

public class Main {

	public static void main(String[] args) {
	
		/***** XML Context block *****/
		
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
		
		// Injection of collections, by referring them (requires a new XML Schema)
		// new Example06().test();
		
	}

}
