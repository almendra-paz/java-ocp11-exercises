import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

public class PrintingDataExample{

	public static void main(String args[]) throws Exception{
		File source = new File("printing.txt");
		try(var out = new PrintWriter(new BufferedWriter
						(new FileWriter(source)))){
			out.print("Hello: ");
			out.println("User");
			out.print(1/3.0);
			out.println('C');
			out.format("Today is %s del año %d", "Viernes", 2022);

			System.out.format("Today is %s del anio %d", 
							"Viernes", 2022);
			out.println();
			out.print(1/3.0);
		}
		
	}

}