import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
	private int id;
	private String name;

	public int compareTo(Student student){
		//Belinda.compareTo(Ana)-> +
		return student.name.compareTo(this.name);
		//return this.name.compareTo(student.name);
		//return student.id - this.id; 
	}

	public String toString(){
		return "name: "+name;
	}

	public static void main(String args[]){
		var a1= new Student();
		a1.id=10; a1.name = "Ana";
		var a2 = new Student();
		a2.id =3; a2.name = "Belinda";
		var a3 = new Student();
		a3.id =5; a3.name = "Carlos";
		System.out.println(a1.compareTo(a2)); //+

		List students = new ArrayList<Student>();
		students.add(a1);
		students.add(a2);
		students.add(a3);
		Collections.sort(students);
		System.out.println(students);
	}

}