package com.alex.cursojavabasico.aula14_15;
import java.util.Scanner;
public class Tarefa11 {

	public static void main(String[] args) {
		double salario = 0;
		double aumento = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu salário: ");
		double input = scan.nextDouble();
		scan.close();
		if (input <=280) {aumento = 20;}
		else if (input <= 700) {aumento = 15;}
		else if (input <= 1500) {aumento = 10;}
		else {aumento = 5;}
		double acrescimo = (aumento/100)*input;
		salario = input + acrescimo;
		System.out.println("Salário inicial: R$"+input);
		System.out.println("Percentual de aumento aplicado: "+aumento+"%");
		System.out.println("Valor do aumento: R$"+acrescimo);
		System.out.println("Novo salário: R$"+salario);
	}
	

}
