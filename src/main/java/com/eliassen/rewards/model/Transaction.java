package com.eliassen.rewards.model;

import lombok.Data;

import java.util.Date;

@Data
public class Transaction {
    private String transactionId;
    private Long amount;
    private Date date;
}
