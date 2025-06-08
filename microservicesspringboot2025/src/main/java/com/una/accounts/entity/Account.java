package com.una.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "accounts")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Account extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;
    @Column(name = "client_id")
    private long clientId;
    @Column(name = "account_type")
    private String accountType;
    private Double balance;

}
