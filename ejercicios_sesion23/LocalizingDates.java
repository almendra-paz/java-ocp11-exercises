import java.util.Locale;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.Month;

import static java.time.format.FormatStyle.SHORT;
import static java.time.format.FormatStyle.MEDIUM;
import static java.time.format.FormatStyle.LONG;
import static java.time.format.FormatStyle.FULL;

public class LocalizingDates{

	public static void main(String args[]){
		var dt = LocalDateTime.of(2022, Month.JUNE, 27,7,00,00);
		var us = Locale.US;
		System.out.println("---");
		print(DateTimeFormatter.ofLocalizedDate(SHORT), dt, us);
		System.out.println("---");
		print(DateTimeFormatter.ofLocalizedDate(MEDIUM), dt, us);
		System.out.println("---");
		print(DateTimeFormatter.ofLocalizedDate(LONG), dt, us);
		System.out.println("---");
		print(DateTimeFormatter.ofLocalizedDate(FULL), dt, us);

	}

	public static void print(DateTimeFormatter dtf, LocalDateTime dateTime, Locale locale){
		System.out.println(dtf.format(dateTime));
		System.out.println(dtf.withLocale(locale).format(dateTime));
	}
}

