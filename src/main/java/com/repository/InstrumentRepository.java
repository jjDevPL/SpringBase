package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entities.InstrumentPriceModifier;

public interface InstrumentRepository extends CrudRepository<InstrumentPriceModifier, Integer> {
}
