import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample{

	public static void main(String args[]){
		Path path1 = Path.of("pandas/my_panda.txt"); //ruta relativa
		Path path2 = Path.of("D:/ClasesMitocode/3.ejercicios_en_clase/ejercicios_sesion20_parte1/pathexample.txt"); //ruta absoluta
		Path path3 = Path.of("pandas","my_panda.txt");
		Path path4 = Paths.get("pandas/my_panda.txt");
	}

}