public class EffectivelyFinal{

	public static void main(String args[]){
		final var bookReader = new MyFileReader("4");
		MyFileReader movieReader = new MyFileReader("5");
		try(bookReader; 
		var tvReader = new MyFileReader("6");
		movieReader){
			System.out.println("Try Block");
		}finally{
			System.out.println("Finally Block");
		}
		//movieReader = null; //deja de ser effective final
	}
}

class MyFileReader implements AutoCloseable{
	private String tag;
	public MyFileReader(String tag){this.tag = tag;}

	@Override public void close(){
		System.out.println("Closed: "+tag);
	}
}