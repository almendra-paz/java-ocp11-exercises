import java.util.ArrayList;

public class MetodosArrayList{

	public static void main (String[] args){
		System.out.println("--- add method --");
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(Boolean.TRUE);

		ArrayList<String> safer = new ArrayList<>();
		safer.add("string");
		//safer.add(Boolean.TRUE);

		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Juan"); 	//[Juan]
		nombres.add("Roberto");	//[Juan, Roberto]
		nombres.add(1, "Maria"); //[Juan, Maria, Roberto]
		nombres.add(3, "Pedro"); //

		nombres.add(5, "Ignacio"); //IndexOutOfBou...
		System.out.println(nombres);

		System.out.println("--- remove method --");
/*		System.out.println(nombres.remove(0));	//[Maria, Roberto, Pedro]
		System.out.println(nombres.remove("Roberto")); //[Maria, Pedro]
		System.out.println(nombres);
*/

	}
}
