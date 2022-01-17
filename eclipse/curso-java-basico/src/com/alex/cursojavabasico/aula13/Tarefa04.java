package com.alex.cursojavabasico.aula13;

import java.util.Scanner;

public class Tarefa04 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as 4 notas bimestrais, separadas por espaço: ");
		double media = ((scan.nextDouble()) + (scan.nextDouble()) + (scan.nextDouble()) + (scan.nextDouble())) / 4;
		System.out.println("Sua média foi: "+media);
		scan.close();
	}
}
