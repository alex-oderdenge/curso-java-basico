package com.alex.cursojavabasico.aula14_15;

import java.util.Scanner;
public class Tarefa12 {

	public static void main(String[] args) {
		//variables
		Scanner scan = new Scanner(System.in);
		int percentIR = 0;
		double ir = 0;
		//input
		System.out.println("Digite seu valor por hora");
		double valorHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas neste mês");
		int horasTrabalhadas = scan.nextInt();
		scan.close();
		
		//calculations
		double salarioBruto = valorHora * (double) horasTrabalhadas;
		//Imposto de Renda
		if (salarioBruto <= 900) {percentIR = 0;}
		else if (salarioBruto <= 1500) {percentIR = 5;}
		else if (salarioBruto <= 2500) {percentIR = 10;}
		else {percentIR = 20;}
		ir = ((double) percentIR/100) * salarioBruto;
		
		//sindicato  (3%)
		double sindicato = salarioBruto * 0.03;
		
		//inss (10%)
		double inss = salarioBruto * 0.1; 
		
		//FGTS (11%)
		double fgts = salarioBruto * 0.11;
		
		double totalDiscounts = +inss+sindicato+ir;
		double salarioLiquido = salarioBruto - totalDiscounts;
		
		//print normal
		/*
		System.out.println("Salário Bruto: ("+valorHora+" * "+horasTrabalhadas+") = R$"+salarioBruto);
		System.out.println("(-) Imposto de renda ("+percentIR+"%) = R$"+ir);
		System.out.println("(-) Sindicato (3%) = R$"+sindicato);
		System.out.println("(-) INSS (10%) = R$"+inss);
		System.out.println("FGTS (11%) = R$"+fgts);
		System.out.println("Total de descontos = R$"+totalDiscounts);
		System.out.println("Salário líquido = R$"+salarioLiquido);
		*/
		
		//print top
		String[] prints = {
				"Salário Bruto: ("+valorHora+" * "+horasTrabalhadas+")", 
				"(-) Imposto de renda ("+percentIR+"%)", 
				"(-) Sindicato (3%)", 
				"(-) INSS (10%)", 
				"FGTS (11%)", 
				"Total de descontos", 
				"Salário líquido", 
		};
		String[] printValues = {
				": R$"+salarioBruto,
				": R$"+ir,
				": R$"+sindicato,
				": R$"+inss,
				": R$"+fgts,
				": R$"+totalDiscounts,
				": R$"+salarioLiquido
		};
		
		int i = 0;
		while (i < prints.length) {
			String space = " ".repeat((prints[0].length() - prints[i].length())+5);
			System.out.println(prints[i] +space+printValues[i]);
			i++;
		}
	}

}
