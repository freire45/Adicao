package br.com.erickfreire.adicao;

import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.print("Insira o Primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Insira o Segundo valor: ");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.printf("Resulato é: %d%n", soma);
				
	}
	

}
