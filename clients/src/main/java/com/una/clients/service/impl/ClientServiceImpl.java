package com.una.clients.service.impl;

import com.una.clients.dto.ClientDto;
import com.una.clients.dto.ClientResponseDto;
import com.una.clients.dto.NewClientRequestDto;
import com.una.clients.entity.Client;
import com.una.clients.exception.ClientNotExistException;
import com.una.clients.repository.ClientRepository;
import com.una.clients.service.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService {

    private ClientRepository clientRepository;
    @Override
    public void createClient(NewClientRequestDto newClientRequestDto) {
        Client client = new Client();
        client.setFirstName(newClientRequestDto.getFirstName());
        client.setLastName(newClientRequestDto.getLastName());
        client.setEmail(newClientRequestDto.getEmail());
        client.setTelephone(newClientRequestDto.getTelephone());
        clientRepository.save(client);
    }
    public ClientResponseDto getClient(long id){
        Client client = clientRepository.findById(id).orElseThrow(
                () -> new ClientNotExistException("Client doesn't exist")
        );
        ClientDto clientDto = new ClientDto(client.getId(), client.getFirstName(), client.getLastName(), client.getEmail(), client.getTelephone());
        return new ClientResponseDto("200", "Success", clientDto);
    }
}
