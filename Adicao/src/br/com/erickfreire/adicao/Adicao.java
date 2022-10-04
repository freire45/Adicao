package br.com.erickfreire.adicao;

import java.util.Scanner;

/**
 * Programa que calcula a adição entre dois valores
 * @author Erick Freire
 * @version 1 - Criado em 04-10-2022
 */

public class Adicao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.println("Programa que realiza a soma entre dois valores: ");
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.printf("O Resultado da Soma é: %d%n", soma);

	}

}
