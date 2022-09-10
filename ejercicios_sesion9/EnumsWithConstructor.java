public class EnumsWithConstructor{
	public static void main(String args[]){
		System.out.println(DocumentType.DNI);
		DocumentType.DNI.printDescription();//call method
		System.out.println(DocumentType.PASS);
	}
	
}

enum DocumentType{
	DNI("dni"), CE("carnet de extranjeria"),
	PASS ("pasaporte");

	private final String description;
	private DocumentType(String description){
		System.out.println("in constructor: "+ description);
		this.description = description;
	}
	public void printDescription(){
		System.out.println(description);
	}
}

