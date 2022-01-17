package com.alex.cursojavabasico.aula13;

import java.util.Scanner;
public class Tarefa06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o raio de um círculo: ");
		double raio = scan.nextDouble();
		double area = (Math.pow(raio, 2)) * 3.14;
		System.out.println("A área do circulo é de: " + area);
		scan.close();
	}

}
