import java.io.File;

public class CrearFile{

	public static void main(String args[]){
		System.out.println("separator: "+ System.getProperty("file.separator"));	
		System.out.println("separator: "+ java.io.File.separator);	
		var file1 = new File("alumnos/JuanPerez.txt");
		System.out.println(".exists() "+ file1.exists());
		System.out.println("getParent() "+ file1.getParent());
		
		System.out.println("---- directorio -----");
		var file2 = new File("D:/ClasesMitocode/3.ejercicios_en_clase/java-ocp11-exercises/ejercicios_sesion20/alumnos");
		System.out.println("isDirectory() "+ file2.isDirectory());
		System.out.println("isFile() "+ file2.isFile());
		System.out.println("length() "+ file2.length());
		System.out.println("getParent() "+ file2.getParent());
	}
}