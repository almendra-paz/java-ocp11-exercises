import java.util.List;
import java.util.ArrayList;

public class LowerBounded{

	public static void addHello( List<? super String> list){
		list.add("hello");
	}


	public static void main(String[] args){
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");
		addHello(strings);

		List<Object> objects = 
			new ArrayList<Object>(strings);
		addHello(objects);

	}


}