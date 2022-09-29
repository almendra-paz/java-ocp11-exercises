import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class FunctionClass{
	public static void main(String args[]){
		UnaryOperator<String> f1 = x->x.toUpperCase();
		System.out.println(f1.apply("cadena"));
	
		BinaryOperator<String> b1 = 
			(string, toAdd) -> string.concat(toAdd);

		System.out.println(b1.apply("cadena", " rota"));

	}
}