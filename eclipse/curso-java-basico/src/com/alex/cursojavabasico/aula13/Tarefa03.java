package com.alex.cursojavabasico.aula13;

import java.util.Scanner;

public class Tarefa03 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int n2 = scan.nextInt();
		int soma = n1+n2;
		System.out.println("A soma dos dois números informados é de: "+soma);
		
		scan.close();
		
	}
}
