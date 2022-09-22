public class GenericStatic{
	public static <T> void sink(T t){
		System.out.println(t);
	}
	public static <T> T identity(T t){
		return t;
	}

	public static void main(String args[]){
		GenericStatic.sink("nombre");
		GenericStatic.<String>sink("nombre");
	}
}
