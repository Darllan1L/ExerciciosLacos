package br.com.generation.lacos;

import java.util.Scanner;

public class ExLacos2 {

	/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    idade for =-99.*/
	
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		 
		int idade = 0, total21 = 0, total50 = 0;
		
		while (idade != -99) {
		
			System.out.println("Digite sua idade:");
			idade = leia.nextInt();
		
			if(idade < 21) {
				total21++;
				
				
			}
						
			else if (idade > 50) {
				total50++;
				
				
			}				
			
		
		}
		
		System.out.println("Total de pessoas abaixo de 21 é: " + total21);
		System.out.println("Total de pessoas acima de 50 é: " + total50);
		
		leia.close();
	}

}
