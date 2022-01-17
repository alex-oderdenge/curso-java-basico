package com.alex.cursojavabasico.aula13;
import java.util.Scanner;
public class Tarefa14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a velocidade de sua internet em Mbps: ");
		int internetSpeed = scan.nextInt();
		System.out.println("Digite o tamanho do arquivo para download (em Mb): ");
		double fileSize = scan.nextDouble();
		scan.close();
		double timeRequiredToDownload = fileSize/internetSpeed;
		System.out.println("O tempo necesário para o download é de "+String.format("%.0f", timeRequiredToDownload) + " minutos");
		
		
		

	}

}
