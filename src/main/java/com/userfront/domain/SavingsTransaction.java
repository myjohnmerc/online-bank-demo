package com.userfront.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SavingsTransaction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Date date;
	private String description;
	private String type;
	private String status;
	private double Amount;
	private BigDecimal availableBalance;
	
	@ManyToOne
	@JoinColumn(name="saving_account_id")
	private SavingsAccount SavingsAccount;
	
	public SavingsTransaction() {}
	
	public SavingsTransaction(Date date, String description, String type, String status, double amount,
			BigDecimal availableBalance, SavingsAccount SavingsAccount) {
		super();
		this.date = date;
		this.description = description;
		this.type = type;
		this.status = status;
		Amount = amount;
		this.availableBalance = availableBalance;
		this.SavingsAccount = SavingsAccount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public SavingsAccount getSavingsAccount() {
		return SavingsAccount;
	}

	public void setSavingsAccount(SavingsAccount SavingsAccount) {
		this.SavingsAccount = SavingsAccount;
	}
	
	
	
}
