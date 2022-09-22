import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetMethods{

	public static void main(String args[]){
		Set<Character> letter = Set.of('a','b');
		System.out.println(letter);
		Set<Character> copy = Set.copyOf(letter);
		System.out.println(copy);

		Set<String> names = new HashSet<>();
		names.add("Maria");
		names.add("Juan");
		names.add("Pedro");
		names.add("Maria");	//false
		names.forEach(x-> System.out.println(x));

		System.out.println("---- TreeSet ----");
		Set<String> namesTree = new TreeSet<>();
		namesTree.add("Maria");
		namesTree.add("Juan");
		namesTree.add("Pedro");
		namesTree.add("Maria"); //false
		namesTree.forEach(x-> System.out.println(x));
	}
}

