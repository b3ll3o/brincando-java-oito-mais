import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasrio = LocalDate.of(2016, Month.JUNE, 5);
		int anos = olimpiadasrio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasrio);
		System.out.println(periodo.getDays());
		
		LocalDate proximasOlimpiadas = olimpiadasrio.plusYears(4);
		
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(proximasOlimpiadas.format(formatador));
		
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy : hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorHora));
		
		YearMonth anoMes = YearMonth.of(agora.getYear(), agora.getMonth());
		
		System.out.println(anoMes);
	}
}
