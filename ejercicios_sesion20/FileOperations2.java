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
		//readData(f1);
		readData2(f1);
	}

	public static void readData(InputStream is) throws IOException{
		System.out.println((char) is.read()); //T
		if(is.markSupported()){
			System.out.println("supported");
			is.mark(100);
			System.out.println((char) is.read()); //I
			is.reset();
		}

		System.out.println((char) is.read()); //I
		System.out.println((char) is.read()); //G
		System.out.println((char) is.read()); //E
	}

	public static void readData2(InputStream is) throws IOException{
		System.out.println((char) is.read());	//T
		is.skip(3);				//IGE
		System.out.println((char) is.read());	//R
		System.out.println((char) is.read());	//
	}

}