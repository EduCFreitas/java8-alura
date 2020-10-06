import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// Interface funcional: possui apenas 1 método abstrato
		// Lambda funciona quando preciso implementar interface que possui uma interface
		// funcional
		// -> identifica lambda
		// O lambda consegue inferir o tipo do parâmetro (String)
		// Possibilidade de retirada das chaves por haver apenas um comando

		/*
		 palavras.sort((s1, s2) -> { if (s1.length() < s2.length()) { return -1; } if
		 (s1.length() > s2.length()) { return 1; } return 0; });
		 */
		//palavras.sort((s1, s2) -> s1.length() - s2.length());
		
		
		//palavras.sort(Comparator.comparing(s -> s.length()));
		// Corresponde a:
		palavras.sort(Comparator.comparing(String::length));
		// A linha de cima corresponde às linhas debaixo
		//Function<String, Integer> funcao = s -> s.length();
		//Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao = new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println(palavras);
		

		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		// A linha de cima corresponde à debaixo
		palavras.forEach(System.out::println);
		
		
		// Simplificando Thread com lambda
		new Thread(() -> System.out.println("Executando um Runnable")).start();

	}

}
