package com.alex.cursojavabasico.aula13;
import java.util.Scanner;
public class Tarefa07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o comprimento de um lado do quadrado: ");
		double area = Math.pow(sc.nextDouble(),2);
		System.out.println("O dobro da área do quadrado é: "+(area*2));
		sc.close();
	}
}
