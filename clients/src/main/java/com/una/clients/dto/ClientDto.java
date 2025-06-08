package com.una.clients.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientDto {
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private String telephone;
}
