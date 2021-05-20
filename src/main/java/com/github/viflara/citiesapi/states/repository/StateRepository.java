package com.github.viflara.citiesapi.states.repository;

import com.github.viflara.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
