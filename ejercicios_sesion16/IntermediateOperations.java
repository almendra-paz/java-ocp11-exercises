import java.util.stream.Stream;

public class IntermediateOperations{


	public static void main(String args[]){
		System.out.println("---- Filter ----");
		Stream<String> pets = Stream.of("gato", "perro", "gallina", "gato", "loro");
		pets.filter(s->s.startsWith("g"))
			.forEach(System.out::println);

		System.out.println("---- Distinct ----");
		pets = Stream.of("gato", "perro", "gallina", "gato", "loro");
		pets.distinct()
			.forEach(System.out::println);

		System.out.println("---- Skip, Limit ----");
		Stream<Integer> infinite = Stream.iterate(1,n->n+1);
		infinite.skip(5).limit(2).forEach(System.out::println);
		
	}

}