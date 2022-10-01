import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Penguin{

	public static void main(String args[]){
		Supplier<Integer> methodRef1 = 				Penguin::countBabies;
		System.out.println(methodRef1.get()); //0
		// ()->Penguin.countBabies();

		Function<Penguin, Integer> methodRef2 = 						Penguin::countBabies;
		System.out.println(
				methodRef2.apply(new Penguin()));
		// a -> Penguin.countBabies(a);

		BiFunction<Penguin, Penguin, Integer> methodRef3 = 				Penguin::countBabies;
		System.out.println(
		methodRef3.apply(new Penguin(),new Penguin()));//2
		// (a,b) -> Penguin.countBabies(a,b);
	}

	public static Integer countBabies(Penguin... cuties){
		return cuties.length;
	}
}