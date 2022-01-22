package com.alex.cursojavabasico.aula14_15;
import java.util.Scanner;
public class Tarefa02 {

	public static void main(String[] args) {
		String positivo = "positivo";
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		if (numero < 0) {positivo = "negativo";}
		System.out.println("O numero digitado ("+numero+") é "+positivo);
		scan.close();
	}

}
