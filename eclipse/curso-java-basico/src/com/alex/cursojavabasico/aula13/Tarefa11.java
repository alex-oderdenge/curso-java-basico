package com.alex.cursojavabasico.aula13;
import java.util.Scanner;
public class Tarefa11 {
	public static void main (String [] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite um número inteiro: ");
	int n1 = scan.nextInt();
	System.out.println("Digite outro número inteiro: ");
	int n2 = scan.nextInt();
	System.out.println("Digite um número decimal: ");
	double n3 = scan.nextDouble();
	scan.close();
	System.out.println("produto do dobro do primeiro com metade do segundo = " + ((n1*2) * (n2/2)));
	//produto do dobro do primeiro com metade do segundo
	// (n1*2) * (n2/2)
	System.out.println("Soma do triplo do primeiro com o terceiro = " + ((n1*3) + (n3)));
	//A soma do triplo do primeiro com o terceiro
	System.out.println("Terceiro número elevado ao cubo = " + Math.pow(n3, 3));
	//O terceiro elevado ao cubo
	
		
	}
}
