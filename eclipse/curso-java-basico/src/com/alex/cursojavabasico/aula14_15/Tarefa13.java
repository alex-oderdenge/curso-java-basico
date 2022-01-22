package com.alex.cursojavabasico.aula14_15;

import java.util.Scanner;

public class Tarefa13 {

	public static void main(String[] args) {
		String day = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 7");
		int input = scan.nextInt();
		scan.close();
		switch (input) {
			case 1: 
				day = "Segunda-feira";
				break;
			case 2:
				day = "Terça-feira";
				break;
			case 3:
				day = "Quarta-feira";
				break;
			case 4:
				day = "Quinta-feira";
				break;
			case 5:
				day = "Sexta-feira";
				break;
			case 6:
				day = "Sábado";
				break;
			case 7:
				day ="Domingo";
				break;
			default:
				System.out.println("Digite uma opção válida.");
				System.exit(0);
		
			
		}
		System.out.println("O dia digitado foi: "+day);
	}

}
