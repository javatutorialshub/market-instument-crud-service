package com.javatutorialshub.market.repository;

import com.javatutorialshub.market.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StockRepository extends JpaRepository<Stock, Long> {
    Collection<Stock> findByName(String name);
    Collection<Stock> findByNameAndDescription(String name, String description);


}
