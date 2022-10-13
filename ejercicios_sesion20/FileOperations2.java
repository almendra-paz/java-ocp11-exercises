import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations{

	public static void main(String args[]) throws IOException{
		FileInputStream f1 = new FileInputStream("lion.txt");
		readData2(f1);
	}

	public static void readData(InputStream is) throws IOException{
		System.out.println((char) is.read());
		if(is.markSupported()){
			System.out.println("supported");
			is.mark(100);
			System.out.println((char) is.read());
			is.reset();
		}

		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());
	}

	public static void readData2(InputStream is) throws IOException{
		System.out.println((char) is.read());	//R
		is.skip(3);				//EYL
		System.out.println((char) is.read());	//E
		System.out.println((char) is.read());	//O
	}

}