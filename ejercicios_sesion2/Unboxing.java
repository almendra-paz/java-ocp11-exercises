public class Unboxing{
	public static void main(String args[]){
		//1. Metodos xxxValue().
		Integer integer1 = Integer.valueOf(200);		
		int int1 = integer1.intValue();
		
		Double double1 = Double.valueOf(200);
		double d1 = double1.doubleValue();
		System.out.println("1. Metodos xxxValue()");
		System.out.println(int1+", "+d1);

		//2. Auto-unboxing
		int i2 = integer1;
		double d2 = double1;
		System.out.println("//2. Auto-unboxing");
		System.out.println(i2+", "+d2);
		
		//3. Primitivo from String
		
		//NumberFormatException
		//int i3 = Integer.parseInt("10.2"); 
		//int i3 = Integer.parseInt(null);
		
		int i3 = Integer.parseInt("10");
		
		//NumberFormatException
		//float float3 = Float.parseFloat("true"); 
		//NullPointerException
		//float float3 = Float.parseFloat(null); 
					
		int i4 = Integer.parseInt("10",2); //2
		
		int i5 = Integer.MIN_VALUE;
		int i6 = Integer.MAX_VALUE;
		System.out.println(i3+", "+ i4+", "+ i5+", "+ i6);		
		
		//float constants
		float f1 = Float.NaN;
		float f2 = Float.NEGATIVE_INFINITY;
		float f3 = Float.POSITIVE_INFINITY;
		System.out.println(f1+", "+f2+", "+f3);
		
		float op1= 12, op2=0;
		float f4 = op1/op2;
		if(f4 == Float.POSITIVE_INFINITY){
			System.out.println("es infinito");
		}
		
		float fe1 = Float.parseFloat(""+Float.NEGATIVE_INFINITY); 
		System.out.println(fe1);
		//""+Float.NEGATIVE_INFINITY
		float fe2 = Float.parseFloat("NaN");
		System.out.println(fe2);








		
		
	}
}