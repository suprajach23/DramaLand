package com.drama.dramaland.controller;

import com.drama.dramaland.model.Country;
import com.drama.dramaland.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/drama/api")
public class CountryController {
    @Autowired
    private CountryService countryService;
    @GetMapping(value = "/getCountries")
    public List<Country> getCountries(){
        return countryService.getAllCountries();
    }

}
