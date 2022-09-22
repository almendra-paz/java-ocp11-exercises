import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Conversiones{

	public static void main(String args[]){
		//De List a Array
		List<String> list = new ArrayList<>();
		list.add("Juan"); list.add("Maria"); list.add("Pedro");
		Object[] objectArray = list.toArray();
		String[] stringArray = list.toArray(new String[0]);
		list.clear();
		System.out.println(Arrays.toString(stringArray));
		System.out.println("lista: "+list);

		// arrays as List
		String[] stringArray2 = {"three","four"};
		List<String> list1 = Arrays.asList(stringArray2);
		System.out.println("lista1: "+list1);
		list1.set(0,"five");
		//list1.add("six");
		System.out.println(Arrays.toString(stringArray2));

		//List.of
		List<String> list2 = List.of("one","two");
		//list2.set(1,"three");
		//list2.remove(1);


		
	}

}