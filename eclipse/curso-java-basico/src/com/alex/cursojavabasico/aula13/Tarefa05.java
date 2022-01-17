package com.alex.cursojavabasico.aula13;

import java.util.Scanner;

public class Tarefa05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor em metros: ");
		int cm = (scan.nextInt())*100;
		System.out.println("Seu valor em CM é de: "+cm);
		
		scan.close();
	}

}
