package com.example.gamingmachine;

import lombok.Data;

@Data
public class GamingMachineRequest {
    private int coin;
    private int qty;
    private double hours;
    private String status;
}
