import java.util.Arrays;

public class CompareArrays{

	public static void main(String args[]){

	int[] a = {1,2,3,4,20,23};	//6
	int[] b = {1,2,3};			//3
	System.out.println(Arrays.compare(a,b)); //positivo
	System.out.println(Arrays.compare(b,a)); //negativo


	int[] c = {1,2,3,4,5,6};	
	int[] d = {1,2,6};
	System.out.println(Arrays.compare(c,d)); //negativo (-1)
	System.out.println(Arrays.compare(d,c)); //positivo (1)

	int[] c1 = {8,3,4,5};	
	int[] d1 = {4,6};
	System.out.println(Arrays.compare(c1,d1)); //positivo (1)
	System.out.println(Arrays.compare(d1,c1)); //negativo (-1)
	
	// "a" < "d", 1 < 4
	String[] c2 = {"aotro",null,"hello"};
	String[] d2 = {"126", null, "hello"};
	System.out.println(Arrays.compare(c2,d2)); //negativo (-32)
	System.out.println(Arrays.compare(d2,c2)); //positivo (32)

	}

}