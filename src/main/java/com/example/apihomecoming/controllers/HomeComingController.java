package com.example.apihomecoming.controllers;

import com.example.apihomecoming.modelentity.Home;
import com.example.apihomecoming.services.IHomeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class HomeComingController {
    @Autowired
    private IHomeService homeService;
    @PostMapping("/HomeComing")
    public Home postHomeComing(@Valid @RequestBody Home home){
        return homeService.saveHome(home);
    }
    @DeleteMapping("/HomeComing/{id}")
    public void deleteHomeComing(@PathVariable Long id){
        homeService.deleteHomeById(id);
    }
    @GetMapping("/homes")
    public List<Home> getHomesByFilters(
            @RequestParam int numerohabitaciones,
            @RequestParam int numerobanos,
            @RequestParam boolean parqueadero,
            @RequestParam boolean vigilancia,
            @RequestParam boolean piscina,
            @RequestParam boolean gimnasio,
            @RequestParam boolean wifi,
            @RequestParam boolean lavanderia,
            @RequestParam boolean EIA,
            @RequestParam boolean EAFIT,
            @RequestParam boolean UPB) {

        return homeService.findHomeByFilters(numerohabitaciones, numerobanos,
                parqueadero, vigilancia, piscina, gimnasio,
                wifi, lavanderia, EIA, EAFIT, UPB);
    }
}
