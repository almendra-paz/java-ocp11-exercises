import java.io.BufferedReader;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class LowHighStreams{

	public static void main(String args[]) throws Exception{
		try(var br = new BufferedReader(new FileReader("example.txt"))){
			System.out.println(br.readLine());
		}

		try(var ois = new ObjectInputStream(
	new BufferedInputStream(new FileInputStream("example.txt")))){
			System.out.println(ois.readObject());
		}


	}

}