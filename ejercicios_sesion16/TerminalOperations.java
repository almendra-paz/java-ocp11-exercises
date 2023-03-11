import java.util.stream.Stream;
import java.util.Optional;

public class TerminalOperations{

	public static void main(String args[]){
		
		System.out.println("---- count ----");
		Stream<String> s = 
			Stream.of("monkey", "gorilla", "bonobo");
		long conteo = s.count();
		System.out.println(conteo);	//3

		System.out.println("---- min ----");
		s = Stream.of("gato", "leon", "mono");
		Optional<String> min = s.min((s1,s2)-> s2.compareTo(s1));
		min.ifPresent(System.out::println); //

		System.out.println("-----findAny, findFirst");
		s = Stream.of("monkey", "gorilla", "bonobo");
		s.findFirst().
			ifPresent(System.out::println); 

		Stream<String> infinite = Stream.generate(()->"hello");
		infinite.findAny().ifPresent(System.out::println);//
	}
}