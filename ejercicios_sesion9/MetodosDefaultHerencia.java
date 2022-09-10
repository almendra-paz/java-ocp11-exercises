public class MetodosDefaultHerencia implements Interface1, Interface2{

	public static void main(String[] args){
		MetodosDefaultHerencia c = new MetodosDefaultHerencia();
		c.doIt();
		c.imprimir("prueba");
	}
	public void doIt(){
		//Interface2.super.doIt(); //metodo default de la I
		System.out.println("interface 3");
	}
	public void imprimir(String message){
		System.out.println(message);
	}
}

interface Interface1{
	void imprimir(String message);
	void doIt();		
}

interface Interface2{
	void imprimir(String message);
	public default void doIt(){
		System.out.println("interface 2");
	}
}
