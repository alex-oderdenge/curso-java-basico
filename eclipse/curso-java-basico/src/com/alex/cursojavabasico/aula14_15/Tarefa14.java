package com.alex.cursojavabasico.aula14_15;
import java.util.Scanner;
public class Tarefa14 {

	public static void main(String[] args) {
		String conceito = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as duas notas do aluno");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double media = (nota1+nota2)/2;
		scan.close();
		//conceito
		
		if (media <= 4) {conceito = "E";}
		else if (media <= 6) {conceito = "D";}
		else if (media <= 7.5) {conceito = "C";}
		else if (media <= 9 ) {conceito = "B";}
		else if (media <= 10) {conceito = "A";}

		/*ao contrário
		if (media >= 9) {conceito = "A";}
		else if (media >= 7.5) {conceito = "B";}
		else if (media >= 6 ) {conceito = "C";}
		else if (media >= 4) {conceito = "D";}
		else {conceito = "E";}
		*/

		
		System.out.println("Primeira nota: "+nota1);
		System.out.println("Segunda nota: "+nota2);
		System.out.println("Média do aluno: "+media);
		System.out.println("Conceito do aluno: "+conceito);
	}

}
