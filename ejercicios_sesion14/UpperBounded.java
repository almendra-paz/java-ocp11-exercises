import java.util.List;
import java.util.ArrayList;

public class UpperBounded{

	public static long total(List<? extends Number> list){
		long count = 0;
		for(Number number: list)
			count += number.longValue();
		System.out.println(count);
		return count;
	}

	public static void main(String[] args){
		List<Integer> enteros = new ArrayList<Integer>();
		enteros.add(Integer.valueOf(1));
		enteros.add(Integer.valueOf(2));
		enteros.add(Integer.valueOf(3));
	
		List<? extends Number> list = enteros;
		//list.add(Integer.valueOf(2));
		total(enteros);
	}


}