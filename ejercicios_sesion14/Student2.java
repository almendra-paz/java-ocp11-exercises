import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student2 implements Comparable<Student2>{
	private int id;
	private String name;

	public int compareTo(Student2 student){
		return this.name.compareTo(student.name);
	}

	public String toString(){
		return name+"-"+id;
	}

	public static void main(String args[]){
		var a1= new Student2();
		a1.id=10; a1.name = "Ana";
		var a2 = new Student2();
		a2.id =3; a2.name = "Belinda";
		var a3 = new Student2();
		a3.id =5; a3.name = "Carlos";

		List students = new ArrayList<Student2>();
		students.add(a1);
		students.add(a2);
		students.add(a3);
		Collections.sort(students);
		System.out.println(students);
/*
		Comparator<Student2> byId = new Comparator<Student2>(){
			public int compare(Student2 e1, Student2 e2){
				return e1.id-e2.id;
			}
		};*/

	//Comparator<Student2> byId = Comparator.comparing(e->e.id);
	Comparator<Student2> byId = Comparator.reverseOrder();

		Collections.sort(students, byId);
		System.out.println(students);
	}

}



