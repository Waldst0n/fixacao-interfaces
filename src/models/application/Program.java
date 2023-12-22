package models.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Contract;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		int contractNumber = scanner.nextInt();
		System.out.print("Data: ");
		LocalDate date = LocalDate.parse(scanner.next(), dtf);
		System.out.print("Valor do contrato: ");
		double contractValue = scanner.nextDouble();
		
		Contract contract = new Contract(contractNumber, date, contractValue);
		
		scanner.close();
				
	}

}
