package com.example.gamingmachine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamingMachineResponse {
    private String message;
    private int returnedChange;

    public GamingMachineResponse(String message, int returnedChange) {
        this.message = message;
        this.returnedChange = returnedChange;
    }
}

