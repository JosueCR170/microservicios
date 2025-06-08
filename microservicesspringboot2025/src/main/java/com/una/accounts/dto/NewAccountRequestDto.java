package com.una.accounts.dto;

import lombok.Data;

@Data
public class NewAccountRequestDto {
    private String accountType;
    private long clientId;
}
