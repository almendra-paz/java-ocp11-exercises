import java.util.List;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerClass{
	public static void main(String args[]){	
		var map = new HashMap<String, String>();
		BiConsumer<String, String> b1 = 
				(k,v) -> map.put(k,v);

		b1.accept("cod1", "Carlos");
		b1.accept("cod2", "Juan");
		b1.accept("cod3", "Santiago");
		System.out.println(map);

		BiConsumer<String, Integer> b2 = 
				(k,v) -> System.out.println(k+" "+v);	
		b2.accept("cod1", 23);	//cod1
	
	}

}

