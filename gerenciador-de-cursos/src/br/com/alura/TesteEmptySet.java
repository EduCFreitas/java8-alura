package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		
		//emptySet é um Set destinado a ser vazio, portanto não pode receber adições
		Set<String> nomes = Collections.emptySet();
		nomes.add("Eduardo");

	}

}
