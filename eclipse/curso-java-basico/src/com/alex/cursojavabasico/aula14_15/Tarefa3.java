package com.alex.cursojavabasico.aula14_15;
import java.util.Scanner;
public class Tarefa3 {

	public static void main(String[] args) {
		boolean error = false;
		String gender = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 'F' ou 'M': ");
		String input = scan.next();
		if (input.equalsIgnoreCase("f")) {gender = "feminino";}
		else if (input.equalsIgnoreCase("m")) {gender = "masculino";}
		else {error = true;}
		if (error == false) {System.out.println("O gênero digitado é: "+gender);}
		else {System.out.println("Erro. Digite uma das opções válidas");}
		scan.close();
	}

}
