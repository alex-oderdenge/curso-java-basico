package com.alex.cursojavabasico.aula14_15;
import java.util.Scanner;
public class Tarefa4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra em minúsculo");
		String letra = scan.next();
		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": System.out.println("Vogal"); break;
		default: System.out.println("Consoante");
		}
		scan.close();
	}

}
