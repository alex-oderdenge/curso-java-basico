package com.alex.cursojavabasico.aula13;
import java.util.Scanner;
public class Tarefa13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu valor hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Digite quantas horas você trabalhou este mês: ");
		double horas = scan.nextInt();
		scan.close();
		double salarioBruto = horas * valorHora;
		double salarioLiquido = salarioBruto*0.76;
		System.out.println("Seu salário bruto deste mês foi de: " + salarioBruto);
		System.out.println("Seu salário líquido deste mês foi de: " + salarioLiquido);		
	}

}
