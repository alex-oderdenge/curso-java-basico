package com.alex.cursojavabasico.aula14_15;
import java.util.Scanner;
public class Tarefa07 {
	public static void main(String[] args) {
		int menor = 0;
		int maior = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite três números separados por espaço: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		scan.close();
		if (n1 > n2) {maior = n1; menor = n2;}
		else {maior = n2; menor = n1;}
		if (n3 > maior) {maior = n3;}
		if (n3 < menor) {menor = n3;}
		System.out.println("O maior número digitado foi : "+maior);
		System.out.println("O menor número digitado foi : "+menor);
		
		
	}
}
