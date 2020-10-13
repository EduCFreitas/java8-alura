package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Teste{
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Eduardo", 26);
		Funcionario f2 = new Funcionario("Diego", 24);
		Funcionario f3 = new Funcionario("Augusto", 20);
		
		Set<Funcionario> funcionarios = new TreeSet<Funcionario>(new OrdenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iterador = funcionarios.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}
}