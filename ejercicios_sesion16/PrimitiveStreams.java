import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Optional;
import java.util.OptionalDouble;


public class PrimitiveStream{

	public static void main(String args[]){
		System.out.println("---- mapeando a un IntStream ----");
		Stream<Integer> stream = Stream.of(1,2,3);
		System.out.println(stream.mapToInt(x->x).sum()); //6

		System.out.println("---- creando un IntStream ----");
		IntStream intStream = IntStream.of(1,2,3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());//2
	}
}