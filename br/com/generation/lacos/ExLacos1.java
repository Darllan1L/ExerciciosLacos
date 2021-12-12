package br.com.generation.lacos;

public class ExLacos1 {

	//Informar todos os números de 1000 a 1999 que quando divididos por 11
	//obtemos resto = 5.
	public static void main(String[] args) {
		
		int numeros;
		
		for ( numeros = 1000; numeros <= 1999; numeros++ ) {
			
			if (numeros % 11 == 5) {
				System.out.println("Os numeros são:" + numeros); }
			}

	}

}
