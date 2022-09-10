public class MetodosDefaultHerencia implements Interface1, Interface2{

	public static void main(String[] args){
		MetodosDefaultHerencia c = new MetodosDefaultHerencia();
		c.doIt();
	}

	public void doIt(){
		System.out.println("interface 2");
	}
}

interface Interface1{
	void doIt();
		
}

interface Interface2{
	public default void doIt(){
		System.out.println("interface 2");
	}
}
