package com.una.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountResponseDto {
    private String statusCode;
    private String message;
    private AccountDto account;
}
