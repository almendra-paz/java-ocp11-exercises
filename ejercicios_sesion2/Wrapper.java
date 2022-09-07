public class Wrapper{

	public static void main(String args[]){
		//1. Constructor		
		Long l2 = new Long(10);
		Long l3 = new Long("10");	// deprecada
		
		Integer integer1 = new Integer(5);
		Integer integer2 = new Integer("5");
		
		Float f1 = new Float(10.2f);
		Float f2 = new Float(10.2);	//Uso de Double
		Float f3 = new Float("10.2f");		
		
		System.out.println("---- 1. COnstructor ------");
		System.out.println(f1+" "+f2+" "+f3);
		System.out.println(f1 == f2);	//false
				
		// 2. Creacion Wrapper mediante ValueOf method
		System.out.println("---- 2. ValueOf ------");
		Long l4 = Long.valueOf(10);
		Long l5 = Long.valueOf(10l);
		Long l6 = Long.valueOf("10");

		Boolean bo1 = Boolean.valueOf(true);
		Boolean bo2 = Boolean.valueOf("true");
		
		Integer i1 = Integer.valueOf(12);
		Integer i2 = Integer.valueOf("12");		
		
		Integer i3 = Integer.valueOf(1200);
		Integer i4 = Integer.valueOf("1200");		
		
		System.out.println(i1+" "+i2);
		System.out.println("i1 == i2:"+ (i1 == i2));
		System.out.println("i3 == i4: "+ (i3 == i4));
		
		// 3. Autoboxing
		Integer integer5 = 128;
		Integer integer6 = 128;
		System.out.println("3. Autoboxing");
		System.out.println(integer5==integer6);
		
		//Excepciones
		//Long l7 = Long.valueOf("10.2");
		//Long l8 = Long.valueOf(null);
		Boolean b1 = Boolean.valueOf("valorNoDefined");
		System.out.println(b1);
		
		
	}

}