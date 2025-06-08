package com.una.accounts.service.impl;

import com.una.accounts.dto.AccountDto;
import com.una.accounts.dto.AccountResponseDto;
import com.una.accounts.dto.NewAccountRequestDto;
import com.una.accounts.entity.Account;
import com.una.accounts.entity.Client;
import com.una.accounts.exception.AccountNotFoundException;
import com.una.accounts.exception.ClientNotExistException;
import com.una.accounts.repository.AccountRepository;
import com.una.accounts.repository.ClientRepository;
import com.una.accounts.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {
    private AccountRepository accountRepository;
    private ClientRepository clientRepository;
    @Override
    public void createAccount(NewAccountRequestDto newAccountRequestDto) {
        Optional<Client> client = clientRepository.findById(newAccountRequestDto.getClientId());
        if(client.isEmpty()){
            throw new ClientNotExistException("Client doesn't exist");
        }
        Account account = new Account();
        account.setClientId(newAccountRequestDto.getClientId());
        account.setAccountType(newAccountRequestDto.getAccountType());
        account.setCreatedAt(LocalDateTime.now());
        account.setBalance(0.0);
        accountRepository.save(account);
    }
    public AccountResponseDto getAccount(long id){
        Account account = accountRepository.findById(id).orElseThrow(
                () -> new AccountNotFoundException("Account doesn't exist")
        );
        AccountDto accountDto=new AccountDto(account.getAccountNumber(),account.getAccountType(),account.getBalance(),account.getClientId());
        return new AccountResponseDto("200","Success",accountDto);
    }
}
