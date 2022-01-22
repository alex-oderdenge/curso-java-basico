package com.alex.cursojavabasico.aula14_15;
import java.util.Scanner;
public class Tarefa10 {

	public static void main(String[] args) {
		boolean error = false;
		String turno = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 'V' ou 'M' ou 'N': ");
		String input = scan.next();
		if (input.equalsIgnoreCase("v")) {turno = "Boa tarde!";}
		else if (input.equalsIgnoreCase("m")) {turno = "Bom dia!";}
		else if (input.equalsIgnoreCase("n")) {turno = "Boa noite!";}
		else {error = true;}
		if (error == false) {System.out.println(turno);}
		else {System.out.println("Erro. Digite uma das opções válidas");}
		scan.close();
	}

}
