package com.alex.cursojavabasico.aula14_15;
import java.util.Scanner;
public class Tarefa05 {

	public static void main(String[] args) {
		String status = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota de um(a) aluno(a): ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota de um(a) aluno(a): ");
		double nota2 = scan.nextDouble();
		double media = (nota1+nota2)/2;
		if (media < 7) {
			status = "Reprovado";
		}
		else if (media < 10) {
			status = "Aprovado";
		}
		else {
			status = "Aprovado com Distinção";
		}
		System.out.println("Média: "+media+" - "+status);
		scan.close();
	}

}
