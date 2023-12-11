package com.example.gamingmachine;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@EntityScan
public class GamingMachine {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private int coinDenomination;
    private int numberOfCoins;
    private double numberOfHours;
    private String status;
}
