public class ManyExceptions{

	public static void main(String arg[]) throws Exception{

	try{
		throw new RuntimeException();
	}catch(RuntimeException e){
		throw new RuntimeException();
	}finally{
		System.out.println("end");
		throw new Exception();
	}


	}

}

