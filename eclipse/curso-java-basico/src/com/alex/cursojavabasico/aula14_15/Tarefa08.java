package com.alex.cursojavabasico.aula14_15;
import java.util.Scanner;
public class Tarefa08 {

	public static void main(String[] args) {
	String menor = "";
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite três preços separados por espaço: ");
	double n1 = scan.nextDouble();
	double n2 = scan.nextDouble();
	double n3 = scan.nextDouble();
	scan.close();
	if (n1 < n2 && n1 < n3) {menor = "primeiro";}
	else if (n2 < n1 && n2 < n3) {menor = "segundo";}
	else {menor = "terceiro";}
	System.out.println("O "+menor+" produto deverá ser comprado.");
	}
}
