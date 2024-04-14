package com.drama.dramaland.service.impl;

import com.drama.dramaland.model.Country;
import com.drama.dramaland.repository.CountryRepository;
import com.drama.dramaland.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;
    @Override
    public List<Country> getAllCountries() {
        List<Country> getAllCountries = countryRepository.findAll();
        return getAllCountries;
        //return getAllCountries.stream().map(Country::getName).collect(Collectors.toList());
    }
}
