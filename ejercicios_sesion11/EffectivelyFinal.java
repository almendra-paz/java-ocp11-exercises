import java.nio.file.Files;
import java.nio.file.Path;

public class EffectivelyFinal{

	public static void main(String args[]) throws Exception{
		//var writer = Files.newBufferedWriter(Path.of(""));

		final var bookReader = new MyFileReader("4");
		MyFileReader movieReader = new MyFileReader("5");
		
		try(bookReader; 
			var tvReader = new MyFileReader("6");
			movieReader)
		{
			System.out.println("Try Block");
		}finally{
			System.out.println("Finally Block");
			bookReader.saludo();
		}
		movieReader.saludo();
		//movieReader = null; //deja de ser effective final
	}
}

class MyFileReader implements AutoCloseable{
	private String tag;
	
	public MyFileReader(String tag){this.tag = tag;}

	@Override public void close(){
		System.out.println("Closed: "+tag);
	}
	
	public void saludo(){
		System.out.println("Hello");
	}
}