package models.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate dateTime;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList();
	
	public Contract() {
		
	}

	public Contract(Integer number, LocalDate dateTime, Double totalValue) {
		this.number = number;
		this.dateTime = dateTime;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDate dateTime) {
		this.dateTime = dateTime;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	
	
	
	
	
	

}
