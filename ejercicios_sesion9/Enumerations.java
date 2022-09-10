public class Enumerations{

	public static void main(String args[]){
		for(Season season: Season.values()){
			System.out.println(season.name() + " "+ season.ordinal());
		}

		Season t1 = Season.valueOf("WINTER");
		System.out.println(t1.name());
		//Season t2 = Season.valueOf("winter"); //Exc
		Season t3 = Season.valueOf(); //err. compilacion
	}

}

enum Season{
	SUMMER, SPRING, WINTER, FALL;
}
