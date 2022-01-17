package com.alex.cursojavabasico.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Tarefa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###.#");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Seu peso ideal é "+(df.format((72.7*altura) - 58)) + "KG");
		scan.close();
	}

}
