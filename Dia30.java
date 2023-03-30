package dia30;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Dia30 {

	public static void main(String[] args) {
		System.out.println(DataExtenso());
	}

	public static String DataExtenso() {
		Locale locale = new Locale("pt", "BR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, 'dia' dd 'de' MMMM 'de' yyyy 'e agora são' HH 'horas e' mm 'minutos.'", locale);
		Date data = new Date();
		return dateFormat.format(data);
	}
}
