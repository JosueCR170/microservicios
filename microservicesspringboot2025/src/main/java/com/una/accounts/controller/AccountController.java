package com.una.accounts.controller;

import com.una.accounts.dto.AccountResponseDto;
import com.una.accounts.dto.NewAccountRequestDto;
import com.una.accounts.dto.ResponseDto;
import com.una.accounts.entity.Account;
import com.una.accounts.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1",produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountController {
    private IAccountService accountService;
    @PostMapping("/account")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody NewAccountRequestDto newAccountRequestDto){
        accountService.createAccount(newAccountRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto("201","Created successfully."));
    }
    @GetMapping("/account")
    public ResponseEntity<AccountResponseDto> getAccount(@RequestParam long id){
        AccountResponseDto response=accountService.getAccount(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
