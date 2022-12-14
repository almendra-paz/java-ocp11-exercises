import java.util.stream.Stream;
import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.TreeSet;
import java.util.Set;
import java.util.function.Predicate;

public class CollectMethod{

	public static void main(String args[]){
		Stream<String> stream = Stream.of("a","b","c","d");

		StringBuilder word = stream.collect(
				StringBuilder::new,
				StringBuilder::append,
				StringBuilder::append
			);
		System.out.println(word);

		stream = Stream.of("a","b","c","d");
		TreeSet<String> set = stream.collect(
				TreeSet::new, //()-> new TreeSet()
				TreeSet::add, //(Set a,String b)-> a.add(b)
				TreeSet::addAll //(Set a,Set b)-> a.addAll(b);
			);
		System.out.println(set);

		stream = Stream.of("a","b","c","d");
		TreeSet<String> set2 = stream.collect(
		Collectors.toCollection(TreeSet::new));
		System.out.println(set2);

		stream = Stream.of("a","b","c","d");
		Set<String> set3 = stream.collect(
		Collectors.toSet());
		System.out.println(set3);
	}
}