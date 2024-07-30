package com.javatutorialshub.market.repository;

import com.javatutorialshub.market.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
    @Query("select sum(q.price) from Quote q where q.quotationDate = :dateTime")
    Double sumAllQuotationsAtDate(@Param("dateTime") LocalDateTime dateTime);
}
