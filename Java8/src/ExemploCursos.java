import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

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
		cursos.add(new Curso("Jaba 8", 113));
		cursos.add(new Curso("C", 55));
		
		//cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		//Imprimir cursos com mais de 100 alunos
		// M�todo stream n�o altera a cole��o original
		int soma = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			// Imprime
			//.forEach(c -> System.out.println(c.getNome()));
			//.map(c -> c.getAlunos())
			.mapToInt(Curso::getAlunos)
			.sum();
		
		System.out.println(soma);
		
	}
	
}
