package com.una.accounts.service;

import com.una.accounts.dto.AccountResponseDto;
import com.una.accounts.dto.NewAccountRequestDto;

public interface IAccountService {
    void createAccount(NewAccountRequestDto newAccountRequestDto);

    AccountResponseDto getAccount(long id);
}
