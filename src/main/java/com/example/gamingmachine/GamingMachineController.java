package com.example.gamingmachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gaming-machine")

//http://localhost:8080//api/gaming-machine
public class GamingMachineController {

    private final GamingMachineService gamingMachineService;

    @Autowired
    public GamingMachineController(GamingMachineService gamingMachineService) {
        this.gamingMachineService = gamingMachineService;
    }

    @PostMapping("/enterCoins")
    public GamingMachineResponse enterCoins(@RequestBody GamingMachineRequest request) {
        return gamingMachineService.processRequest(request);
    }
}
