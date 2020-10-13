package br.com.alura;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as Coleções Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Anchie", 17645);
		Aluno a4 = new Aluno("Eduardo Freitas", 5617); //Mesmo número de matrícula que a2

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println("Quem é o aluno com matrícula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("Aluno: " + aluno);
		
		//Exemplo caso seja necessário um número de identificação (key) para mais de um registro
		//Não é muito utilizado
		Map<Integer, Set<Aluno>> matriculaParaAlunos;

	}

}
