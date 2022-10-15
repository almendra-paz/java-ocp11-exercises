import java.util.Locale;

public class LocaleExample{

	public static void main(String args[]){
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		System.out.println("---- constantes ----");
		System.out.println(Locale.GERMAN); //de
		System.out.println(Locale.GERMANY); //de_DE
		System.out.println(Locale.ITALIAN); //it
		System.out.println(Locale.ITALY); //IT
		System.out.println(Locale.CHINESE); //zh

		System.out.println("---- constructor o builder ----");
		System.out.println(new Locale("fr"));
		System.out.println(new Locale("hi", "IN"));
		System.out.println(new Locale("zh", "PE"));

		Locale l1 = new Locale.Builder()
				.setLanguage("en")
				.setRegion("US")
				.build();
		System.out.println(l1);

		System.out.println("Cambiando el default");
		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("fr"));
		System.out.println(Locale.getDefault());


	}

}