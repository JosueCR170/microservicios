package com.una.clients.controller;

import com.una.clients.dto.ClientResponseDto;
import com.una.clients.dto.NewClientRequestDto;
import com.una.clients.dto.ResponseDto;
import com.una.clients.service.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1",produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class ClientController {
    private IClientService ClientService;
    @PostMapping("/client")
    public ResponseEntity<ResponseDto> createClient(@RequestBody NewClientRequestDto newClientRequestDto){
        ClientService.createClient(newClientRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto("201","Created successfully."));
    }
    @GetMapping("/client")
    public ResponseEntity<ClientResponseDto> getClient(@RequestParam long id){
        ClientResponseDto response= ClientService.getClient(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
