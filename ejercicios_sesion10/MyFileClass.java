public class MyFileClass implements AutoCloseable{
	private final int num;
	public MyFileClass(int num){
		this.num = num;
	}
	public void close(){
		System.out.println("Closing: "+num);
	}

	public static void main(String args[]){
		
		//Secuencia cuando se lanza la excepcion
		//1. Se cierran los recursos (invoca metodo close)
		//2. bloque catch(){}
		//3. bloque finally{}
		
		try(MyFileClass a1 = new MyFileClass(1); MyFileClass a2 = new MyFileClass(2)){
			System.out.println("iniciando bloque try");
			//throw new RuntimeException();
		}catch(Exception e){
			System.out.println("en el bloque catch");
		}finally{
			System.out.println("finally");
		}
	}
}