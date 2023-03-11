import java.io.Serializable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.EOFException;

import java.util.ArrayList;
import java.util.List;

public class SerializationExample{

	public static void main(String args[]) throws Exception{
		Gorilla go = new Gorilla("Kong", 20, true);//nombre: "Kong", edad: 20, friendly: true, favoritefood: ""
		Gorilla go2 = new Gorilla(); //nombre: "King", 10, false, "banana"
		var f1 = new File("gorilla.txt");

		saveToFile(List.of(go, go2), f1);
		List<Gorilla> list = readFromFile(f1);
		System.out.println(list); 
	}

	public static void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException{
		try(var out = new ObjectOutputStream
			(new BufferedOutputStream(new FileOutputStream(dataFile)))){
			for(Gorilla go: gorillas)
				out.writeObject(go);
		}
	}

	public static List<Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException{
		var gorillas = new ArrayList<Gorilla>();
		try(var in = new ObjectInputStream(new BufferedInputStream
						(new FileInputStream(dataFile)))){
			while(true){
				var object = in.readObject();
				if(object instanceof Gorilla)
					gorillas.add((Gorilla) object);
			}
		}catch(EOFException e){}

		return gorillas;
	}
}

class Gorilla implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private static Boolean friendly;
	private transient String favoriteFood;

	public String toString(){
		return "name: "+name+ ", age: "+age+ ", friendly: "+friendly+
			 ", favoriteFood: "+favoriteFood;
	}

	public Gorilla(){
		this.name = "King";
		this.age = 10;
		this.friendly = false;
		this.favoriteFood="banana";
	}

	public Gorilla(String name, int age, Boolean friendly){
		this.name = name;
		this.age = age;
		this.friendly = friendly;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

}