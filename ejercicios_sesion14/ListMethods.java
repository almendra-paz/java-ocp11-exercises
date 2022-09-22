import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;

public class ListMethods{

	public static void main(String args[]){
		List<Integer> numbers = Arrays.asList(1,2,3);
		numbers.replaceAll(x->x*2);
		System.out.println(numbers);

		List<Integer> list1 = new LinkedList<>();
		list1.add(2);
		list1.addAll(numbers);
		System.out.println(list1);

		for(Integer a: list1){
			System.out.println(a);
		}

		Iterator<Integer> iter = list1.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}

