interface Movable{
	static void move(){}
}

interface Readable{
	void read();
}

class Herencia{}

class Implementacion extends Herencia implements Movable, Readable{

	public void move(){
		System.out.println("Implementando move");
	}

	public void read(){
		System.out.println("Implementando read");
	}
}

