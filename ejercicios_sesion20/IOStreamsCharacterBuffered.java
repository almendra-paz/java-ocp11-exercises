import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamsCharacter{

	public static void main(String args[]) throws IOException{
		var f1 = new File("example.txt");
		var f2 = new File("exampleCharacterBufferedStream.txt");
		copyTextFile(f1, f2);
	}

	public static void copyTextFile(File src, File dest) throws IOException{
		try(var reader = new BufferedReader(new FileReader(src)); 
		var writer = new BufferedWriter(new FileWriter(dest))){
			String s;
			while((s=reader.readLine())!= null){
				System.out.println(s);
				writer.write(s);
				writer.newLine();
			}
		}
	}
}