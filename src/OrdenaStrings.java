import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Amelia");
		nomes.add("João");
		nomes.add("Leonardo");
		nomes.add("Maria");
		nomes.add("Bruno");
		
		Comparator<String> comparador = new ComparadorTamanho();
		//Collections.sort(nomes, comparador);
		
		nomes.sort(comparador);
		
		System.out.println(nomes);
		
		nomes.forEach(nome -> System.out.println(nome));
	}
}

class ComparadorTamanho implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length())
			return -1;
		
		if(o1.length() > o2.length())
			return 1;
		
		return 0;
	}
	
}
