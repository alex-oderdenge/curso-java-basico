package com.alex.cursojavabasico.aula13;
import java.util.Scanner;
public class Tarefa08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite qual o seu valor a hora: ");
		int valorHora = scan.nextInt();
		System.out.println("Quantas horas você trabalhou este mês? ");
		int horas = scan.nextInt();
		System.out.println("O seu salário deste mês é: "+ horas*valorHora);
		scan.close();
	}

}
