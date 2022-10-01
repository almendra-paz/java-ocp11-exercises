import java.util.stream.Stream;
import java.util.Optional;

public class TerminalOperations{

	public static void main(String args[]){
		Stream<String> infinite = Stream.generate(()->"hello");

		System.out.println("---- count ----");
		Stream<String> s = 
			Stream.of("monkey", "gorilla", "bonobo");
		long conteo = s.count();
		System.out.println(conteo);	//3		

		System.out.println("---- min ----");
		s = Stream.of("monkey", "gorilla", "bonobo");
		Optional<String> min = s.min((s1,s2)-> s1.compareTo(s2));
		min.ifPresent(System.out::println);

		System.out.println("-----findAny, findFirst");
		s = Stream.of("monkey", "gorilla", "bonobo");
		s.findAny().
			ifPresent(System.out::println); //monkey

		infinite.findAny().ifPresent(System.out::println);
	}
}