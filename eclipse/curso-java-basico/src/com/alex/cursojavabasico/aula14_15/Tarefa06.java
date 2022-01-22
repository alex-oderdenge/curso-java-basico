package com.alex.cursojavabasico.aula14_15;
import java.util.Scanner;
public class Tarefa06 {

	public static void main(String[] args) {
	int maior = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite três números separados por espaço: ");
	int n1 = scan.nextInt();
	int n2 = scan.nextInt();
	int n3 = scan.nextInt();
	if (n1 > n2) {maior = n1;}
	else {maior = n2;}
	if (n3 > maior) {maior = n3;}
	System.out.println("O maior número digitado foi: "+maior);
	scan.close();
	}

}
