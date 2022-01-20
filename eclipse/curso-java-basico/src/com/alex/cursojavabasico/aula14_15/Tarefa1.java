package com.alex.cursojavabasico.aula14_15;
import java.util.Scanner;
public class Tarefa1 {

	public static void main(String[] args) {
		int maiornumero = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int n1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = scan.nextInt();
		if (n1 > n2) {
			maiornumero = n1;
		}
		else {
			maiornumero = n2;
		}
		System.out.println("O maior número é: "+maiornumero);
		scan.close();
	}

}
