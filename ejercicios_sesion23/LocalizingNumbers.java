import java.util.Locale;
import java.text.NumberFormat;

public class LocalizingNumbers{

	public static void main(String args[]){

		int participantesPorAnio = 3_200_000;
		int participantesPorMes = participantesPorAnio/12;

		var us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(participantesPorMes));

		var ge = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(ge.format(participantesPorMes));

		var pe = NumberFormat.getInstance();
		System.out.println(pe.format(participantesPorMes));

		var curr_pe = NumberFormat.getCurrencyInstance();
		var curr_us = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(curr_pe.format(participantesPorMes));
		System.out.println(curr_us.format(participantesPorMes));
	}
}