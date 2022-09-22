import java.util.List;
import java.util.ArrayList;

public class Unbounded{

	public static void printList(List<?> list){
		for(Object x: list)
			System.out.println(x);
	}

	public static void main(String[] args){
		List<String> keywords = new ArrayList<>();
		keywords.add("un string");
		keywords.add("2 string");
		printList(keywords);
	}


}