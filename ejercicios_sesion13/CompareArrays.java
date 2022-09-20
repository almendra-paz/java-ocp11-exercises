import java.util.Arrays;

public class CompareArrays{

	public static void main(String args[]){

	int[] a = {1,2,3,4,5};	
	int[] b = {1,2,3};
	System.out.println(Arrays.compare(a,b)); //positivo
	System.out.println(Arrays.compare(b,a)); //negativo

	int[] c = {1,2,3,4,5};	
	int[] d = {1,2,6};
	System.out.println(Arrays.compare(c,d)); //negativo
	System.out.println(Arrays.compare(d,c)); //positivo

	int[] c1 = {8,3,4,5};	
	int[] d1 = {4,6};
	System.out.println(Arrays.compare(c1,d1)); //positivo
	System.out.println(Arrays.compare(d1,c1)); //negativo

	String[] c2 = {"a",null,"hello"};	
	String[] d2 = {"d", null, "hello"};
	System.out.println(Arrays.compare(c2,d2)); //negativo
	System.out.println(Arrays.compare(d2,c2)); //positivo

	}

}