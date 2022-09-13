public class Test{
	public static void main(String args[]){
		try{			
			throw new RuntimeException();
			System.out.println("end of method");
		}catch(Exception e){
		}
	}
}