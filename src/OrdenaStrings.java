import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Amelia");
		nomes.add("João");
		nomes.add("Leonardo");
		nomes.add("Maria");
		nomes.add("Bruno");
		
//		Comparator<String> comparador = new ComparadorTamanho();
//		
//		nomes.sort(comparador);
		
//		nomes.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				if(o1.length() < o2.length())
//					return -1;
//				
//				if(o1.length() > o2.length())
//					return 1;
//				
//				return 0;
//			}
//		});
		
//		nomes.sort((s1, s2) -> {
//			if(s1.length() < s2.length())
//				return -1;
//			
//			if(s1.length() > s2.length())
//				return 1;
//			
//			return 0;
//		});
		
		nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(nomes);
		
		Consumer<String> consumidor = new ImprimiNaLinha();
		nomes.forEach(consumidor);
		
		Consumer<String> consumirdor2 = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
			
		};
		
		nomes.forEach(consumirdor2);
		
		nomes.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
			
		});
		
		nomes.forEach(nome -> System.out.println(nome));
	}
}

class ImprimiNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
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
