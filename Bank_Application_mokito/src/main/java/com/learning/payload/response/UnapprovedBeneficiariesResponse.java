package com.learning.payload.response;

import java.time.LocalDateTime;

import com.learning.enums.AccountType;
import com.learning.enums.Active;
import com.learning.enums.Approved;

import lombok.Data;

@Data
public class UnapprovedBeneficiariesResponse {
	private AccountType accType;
	private String customerName; 
	private long accNo ;
	private LocalDateTime dateCreated; 
	private Active approved;
}
