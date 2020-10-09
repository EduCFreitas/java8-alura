package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as Coleções Java", "Paulo Silveira");
		//List<Aula> aulas = javaColecoes.getAulas();
		//System.out.println(aulas);
		//aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);

	}

}
