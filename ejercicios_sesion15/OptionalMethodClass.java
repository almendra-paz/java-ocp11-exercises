import java.util.Optional;

public class OptionalMethodClass{

	public static void main(String args[]){
		Optional<Double> opt1 = promedio(20,18,17,12);
		Optional<Double> opt2 = promedio();
		
		opt1.ifPresent(o -> System.out.println(o));
		opt2.ifPresent(o -> System.out.println(o)); 
		System.out.println(opt1.orElse(20.50)); //16.75
		System.out.println(opt2.orElseGet(()->20.50));
		//opt2.orElseThrow();
		opt2.orElseThrow(()-> new RuntimeException());

	}

	public static Optional<Double> promedio(int... scores){
		if(scores.length == 0) return Optional.empty();

		int suma = 0;
		for(int nota: scores)
			suma += nota;
		return Optional.of((double) suma/scores.length);
	}

}