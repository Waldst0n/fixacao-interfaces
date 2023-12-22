package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	

	public ContractService(OnlinePaymentService onlinePaymentService) {
		
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		contract.getInstallments().add(new Installment(LocalDate.of(2022, 12, 06), 206.45));
		contract.getInstallments().add(new Installment(LocalDate.of(2023, 8, 15), 1000.45));
	}
	
}
