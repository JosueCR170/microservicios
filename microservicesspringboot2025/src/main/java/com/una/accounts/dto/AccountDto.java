package com.una.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {
    private Long accountNumber;
    private String accountType;
    private Double balance;
    private long clientId;
}
