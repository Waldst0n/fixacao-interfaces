package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		int number = scanner.nextInt();
		System.out.print("Data: ");
		LocalDate date = LocalDate.parse(scanner.next(), dtf);
		System.out.print("Valor do contrato: ");
		double totalValue = scanner.nextDouble();
		
		Contract contract = new Contract(number , date , totalValue );
		
		System.out.print("Digite o número de parcelas: ");
		int installmentsnumber = scanner.nextInt();
		
		ContractService contractService = new ContractService(null);
		
		contractService.processContract(contract, installmentsnumber);
		
		System.out.println("Parcelas");
		
		for(Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		scanner.close();
				
	}

}
