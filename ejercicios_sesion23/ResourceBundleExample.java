import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample{

	public static void main(String args[]){
		var us = new Locale("en", "US");
		welcomeMessage(us);
		var es = new Locale("es", "PE");
		welcomeMessage(es);
	}

	public static void welcomeMessage(Locale locale){
		var rb= ResourceBundle.getBundle("Welcome", locale);
		System.out.println(rb.getString("hello")+", "+rb.getString("open"));
	}

}