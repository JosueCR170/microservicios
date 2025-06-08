package com.una.clients.service;

import com.una.clients.dto.ClientResponseDto;
import com.una.clients.dto.NewClientRequestDto;

public interface IClientService {
    void createClient(NewClientRequestDto newClientRequestDto);

    ClientResponseDto getClient(long id);
}
