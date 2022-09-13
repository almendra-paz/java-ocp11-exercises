public class Test{
	public static void main(String args[]){
		try{
			throw new RuntimeException();
			throw new ArrayIndexOutOfBoundsException();
		}catch(Exception e){
		}
	}
}