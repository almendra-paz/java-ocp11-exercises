public class Multidimensional{

	public static void main(String arg[]){
		//creacion e inicializacion unidimensional
		int b[] = new int[]{1,2,3};
		
		int [][][] a1 = new int[2][][];
		
		//creacion e inicializacion multidimensional
		
		//inicializaciones equivalentes
		int[][] a2 = new int[][]{new int[]{1,2,3}};
		System.out.println("a2.length: "+a2.length);
	 	
		int[][] a3 = new int[][]{{1,2,3},{1,2}};
		//int[][] a3 = {{1,2,3},{1,2}};
		System.out.println("a3.length: "+a3.length);//2
		System.out.println("a3[0].length: "+a3[0].length);//3
		System.out.println("a3[1].length: "+a3[1].length);//2		

		Object[] obj[] = {{"una cadena"},{null},
					{new Object(), new Integer(4)}};
		System.out.println("obj.length: "+obj.length); //3
		System.out.println("obj[0].length: "+obj[0].length); //1
		//Object obj[][];
		
		//Asignaciones
		System.out.println("----- Asignaciones ------");
		int[][] c = new int[3][4];
		Object[] b1 = c;				// si compila

		Object[] oa = new int[2][3];		//si compila
		//Object[] oa = {{0,0,0},{0,0,0},{0,0,0}}

		Object[][] oaa = new Integer[2][3];		//no compila
		//Object[][] oa = {{0,0,0},{0,0,0},{0,0,0}}
	}
}




