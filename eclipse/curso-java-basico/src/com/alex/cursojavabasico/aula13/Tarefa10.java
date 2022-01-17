package com.alex.cursojavabasico.aula13;
import java.util.Scanner;

public class Tarefa10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double c = scan.nextDouble();
		double f = (c*9/5)+32;
		System.out.println("A temperatura em Farenheit é: " + f);
		scan.close();
	}

}
