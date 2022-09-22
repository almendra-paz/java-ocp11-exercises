import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class MapMethods3{

	public static void main(String args[]){
		Map<String,String> map1= new HashMap<>();
		map1.put("cod1","Juan");
		map1.put("cod2","Carlos");
		map1.put("cod3","Karla");

		//--- Foreach and EntrySet
		map1.forEach((k,v)-> System.out.println(v+ " "+k));

		map1.values().forEach(v->System.out.println(v));
		map1.entrySet().forEach(e-> 
		System.out.println(e.getKey() + e.getValue()));

		// getOrDefault
		System.out.println(map1.get("cod4")); //null
		System.out.println(map1.getOrDefault("cod4","No encontrado"));

		//replace() and replaceAll()
		String original = map1.replace("cod1", "Maria");
		System.out.println("original: "+original);
		System.out.println(map1);

		map1.replaceAll((k,v)-> k+v);
		System.out.println(map1);	

		map1.putIfAbsent("cod1","Maria");
		map1.putIfAbsent("cod4","Maria");
		System.out.println(map1);
	}
}

