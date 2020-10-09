package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		//Set não garante a ordem sequencial dos objetos inseridos nele
		//Não aceita elementos repetidos
		//Vantagens: Velocidade e performance em determinadas operações
		//Set<String> alunos = new HashSet<String>();
		Collection<String> alunos = new HashSet<String>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza"); //Não é adicionado por ser repetido
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		
		/*for (String aluno : alunos) {
			System.out.println(aluno);
		}*/
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<String>(alunos);

	}

}
