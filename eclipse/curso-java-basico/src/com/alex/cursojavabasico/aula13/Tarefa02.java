package com.alex.cursojavabasico.aula13;
import java.util.Scanner;
public class Tarefa02 {

	public static void main(String[] args) {
		// Faça um programa que peça um número e então mostra a mensagem "O número informado foi [número]".
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		System.out.println("O número informado foi "+numero);
		scan.close();
	}

}
