import java.util.function.Consumer;

public class LambdaVariables3{
	private String color;

	public void caw(String name){

		String volume = "loudly";
		name = "Caty";			
		color = "black";

		Consumer<String> consumer = s -> 					System.out.println("name: "+ name + 
			", volume: "+volume+", color: "+color);
	}
}