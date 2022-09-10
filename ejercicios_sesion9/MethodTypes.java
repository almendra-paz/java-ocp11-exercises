interface MethodTypes{	

	//abstractos: solo de admiten publicos
	void print();	
		
	//concretos: publicos o privados (protected no)
		//metodos finales no son permitidos	
	
		//instancia: siempre privados
	private void print2(){
		System.out.println("");
	}	
	
		//estaticos: publicos o privados
	public static void print4(){
		System.out.println("");
	}
	private static void print5(){
		System.out.println("");
	}
	
		//default: siempre publicos
	default void print6(){
		System.out.println("");
	}

	static void sayHello(int x){
		if(x>0)	printMessage();
	}

	private static void printMessage(){
		System.out.println("Hello!");
	}

	
	//void move(int x){
	//default void move(int x){
	//private void move(int x){
	static void move(int x){
		System.out.println("ok");
	}
}	