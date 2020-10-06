import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
		 * palavras.sort((s1, s2) -> { if (s1.length() < s2.length()) { return -1; } if
		 * (s1.length() > s2.length()) { return 1; } return 0; });
		 */
		palavras.sort((s1, s2) -> s1.length() - s2.length());

		System.out.println(palavras);

		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);
		// A linha de cima corresponde à debaixo
		palavras.forEach(s -> System.out.println(s));

	}

}
