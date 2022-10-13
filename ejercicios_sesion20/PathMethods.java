import java.nio.file.Paths;
import java.nio.file.Path;

public class PathMethods{

	public static void main(String args[]){
		Path path = Paths.get("panda/nuevo/my_panda.txt");
		System.out.println("Path is: "+ path);

		System.out.println("---- getNameCount, getName ----");
		System.out.println("getNameCount is: "+ path.getNameCount());//3
		System.out.println("getName: "+ path.getName(0));

		System.out.println("---- Subpath ----");
		System.out.println("SubPath is: "+ path.subpath(0,3));
		System.out.println("SubPath is: "+ path.subpath(1,2));
		System.out.println("SubPath is: "+ path.subpath(1,3));

		System.out.println("---- getFileName, getParent, getRoot ----");
		System.out.println(path.getFileName());
		System.out.println(path.getRoot());
		System.out.println(path.getParent());

		System.out.println("---- isAbsolute, toAbsolutePath ----");
		System.out.println(path.isAbsolute());
		System.out.println(path.toAbsolutePath());

		System.out.println("---- resolve ----");
		System.out.println(path.resolve("/second/third"));

		//Path path = Paths.get("panda/nuevo/my_panda.txt");
		System.out.println("---- relativize ----");
		System.out.println(
			path.relativize(Path.of("new")));
		System.out.println(
			path.relativize(Path.of("nuevo/second_panda.txt")));
	}

}





