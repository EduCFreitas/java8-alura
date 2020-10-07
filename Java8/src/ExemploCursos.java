import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Curso{
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", alunos=" + alunos + "]";
	} 

}

public class ExemploCursos {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		// Método stream não altera a coleção original
		OptionalDouble media = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			// Imprime
			//.forEach(c -> System.out.println(c.getNome()));
			//.map(c -> c.getAlunos())
			.mapToInt(Curso::getAlunos)
			.average();
		
		System.out.println(media);
		
		System.out.println("------------------");
		/*cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));*/
		
		cursos.parallelStream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
					c -> c.getNome(),
					c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
		
		System.out.println("------------------");
		
		//Cálculo da média de alunos nos cursos
		OptionalDouble mediaAlunos = cursos.stream()
			.mapToInt(c -> c.getAlunos())
			.average();
		System.out.println("Média de alunos: " + mediaAlunos);
		
		//Imprimir cursos com mais de 50 alunos
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.findFirst();
		
		// Criando stream de String contendo nomes de cursos
		Stream<String> nomes = cursos.stream()
				.map(Curso::getNome);
		
	}
	
}
