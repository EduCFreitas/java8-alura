package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TesteMap {

	public static void main(String[] args) {
		Map<String, Integer> nomesParaIdade = new HashMap<String, Integer>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		Set<String> chaves = nomesParaIdade.keySet();
		chaves.forEach(nome -> {
			System.out.println(nome);
		});
		System.out.println("-------------------");
		
		Collection<Integer> valores = nomesParaIdade.values();
		valores.forEach(idade -> {
			System.out.println(idade);
		});
		System.out.println("-------------------");
		
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		associacoes.forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});

	}

}
