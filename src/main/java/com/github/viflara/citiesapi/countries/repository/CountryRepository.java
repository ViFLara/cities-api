package com.github.viflara.citiesapi.countries.repository;

import com.github.viflara.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
