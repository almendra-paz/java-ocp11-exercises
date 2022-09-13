public class TryCatchExample{
		
	public static void main(String args[]){
		try{
			throwException();
			System.out.println("end of try");
		}catch(NullPointerException | ArrayIndexOutOfBoundsException e){
			System.out.println("captured 1 ");
			throw new RuntimeException();
		}catch(Exception e){
			System.out.println("captured 2");
		}
	}
	
	public static void throwException(){
		throw new ArrayIndexOutOfBoundsException();
	}
}