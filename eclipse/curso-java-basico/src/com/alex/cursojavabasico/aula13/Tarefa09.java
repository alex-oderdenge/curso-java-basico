package com.alex.cursojavabasico.aula13;
import java.util.Scanner;
import java.text.*;
public class Tarefa09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Digite a temperatura em Farenheit: ");
		double f = scan.nextDouble();
		System.out.println("A temperatura digitada, em Celsius, é de: "+df.format((5*(f-32)/9)));
		scan.close();
	}

}
