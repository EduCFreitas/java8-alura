package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		
		//emptySet � um Set destinado a ser vazio, portanto n�o pode receber adi��es
		Set<String> nomes = Collections.emptySet();
		nomes.add("Eduardo");

	}

}
